package End2020.Paper1.Q2;

public class ClassArray {
    String[] classA;
    String[] classB;
    String[] classC;

    public ClassArray() {
        this.classA = new String[0];
        this.classB = new String[0];
        this.classC = new String[0];
    }

    public void sortToClass(String ipAddress) {
        String first = ipAddress.trim().split("\\.")[0];
        int number = Integer.parseInt(first);
        if (number > 1 && number < 126) {
            classA = insert(classA, ipAddress);
        } else if (number > 128 && number < 191) {
            classB = insert(classB, ipAddress);
        } else if (number > 192 && number < 223) {
            classC = insert(classC, ipAddress);
        }
    }

    public String[] insert(String[] arr, String address) {
        String[] ret = new String[arr.length + 1];
        System.arraycopy(arr, 0, ret, 0, arr.length);
        ret[arr.length] = address;
        return ret;
    }

    public void print(){
        System.out.print("Class A : ");
        for (String s : classA) {
            System.out.print("[" + s + "], ");
        }
        System.out.println();
        System.out.print("Class B : ");
        for (String s : classB) {
            System.out.print("[" + s + "], ");
        }
        System.out.println();
        System.out.print("Class C : ");
        for (String s : classC) {
            System.out.print("[" + s + "], ");
        }
        System.out.println();
    }

    public Node makeNode(String[] arr){
        int i = 0;
        while(i> arr.length){
            return new Node(arr[i]);
        }
        return null;
    }
}