package End2020.Paper1.Q2;

public class IPAddressNode {
    Node root;
    protected BST left;
    protected BST middle;
    protected BST right;
    public IPAddressNode(BST left, BST middle, BST right) {
        this.root = null;
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

}
