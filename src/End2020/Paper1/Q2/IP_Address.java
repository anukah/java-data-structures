package End2020.Paper1.Q2;

import java.util.Objects;

public class IP_Address {
    IP_Address_Node root;
    public IP_Address() {
        this.root = new IP_Address_Node();
    }

    private static String determineClass(String address) {
        String first = address.split("\\.")[0];
        Integer value = Integer.parseInt(first);
        if (1<=value && value<126){
            return "Class_A";
        } else if (128<=value && value<191){
            return "Class_B";
        } else if (192<=value && value<223){
            return "Class_C";
        }
        return null;
    }

    public void insert(String address){
        if (address!=null) {
            if (Objects.equals(determineClass(address), "Class_A")){
                root.left.insert(address);
            } else if (Objects.equals(determineClass(address), "Class_B")){
                root.middle.insert(address);
            } else if (Objects.equals(determineClass(address), "Class_C")){
                root.right.insert(address);
            }
        }
    }

    public void display(){
        System.out.println("Class_A : " + root.left.display());
        System.out.println("Class_B : " + root.middle.display());
        System.out.println("Class_C : " + root.right.display());
    }


}
