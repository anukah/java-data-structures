package End2020.Paper1.Q2;

public class IP_Address {
    BST classA;
    BST classB;
    BST classC;
    public IP_Address() {
        this.classA = new BST();
        this.classB = new BST();
        this.classC = new BST();
    }
    public String determineClass(String ip){
        String sub = ip.strip().split("\\.")[0];
        int val = Integer.parseInt(sub);
        if (1<=val && val<126) return "Class A";
        else if (128<=val && val<191) return "Class B";
        else return "Class C";
    }
    public void insert(String[] ips){
        for (String ip:ips) {
            if (determineClass(ip).equals("Class A")){
                classA.insert(ip);
            } else if (determineClass(ip).equals("Class B")){
                classB.insert(ip);
            } else classC.insert(ip);
        }
    }

    public void getipsAtLevel(int level){
        StringBuilder sb = new StringBuilder();
        sb.append(classA.atLevel(level)).append(", ").append(classB.atLevel(level)).append(", ").append(classC.atLevel(level));
        System.out.println(sb);
    }
    public void display(){
        System.out.print("Class A : ");
        classA.display();
        System.out.println();
        System.out.print("Class B : ");
        classB.display();
        System.out.println();
        System.out.print("Class C : ");
        classC.display();
        System.out.println();
    }
    public void delete(String ip){
        if (determineClass(ip).equals("Class A")) classA.delete(ip);
        else if (determineClass(ip).equals("Class B")) classB.delete(ip);
        else classC.delete(ip);
    }


}
