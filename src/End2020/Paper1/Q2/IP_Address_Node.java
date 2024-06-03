package End2020.Paper1.Q2;

public class IP_Address_Node {
    protected BST left;
    protected BST middle;
    protected BST right;

    public IP_Address_Node() {
        String ip_address = "IP_Address";
        this.left = new BST();
        this.middle = new BST();
        this.right = new BST();
    }
}
