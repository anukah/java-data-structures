package End2020.Paper1.Q2;

public class IPAddress {
    IPAddressNode root;
    BST classA;
    BST classB;
    BST classC;
    public IPAddress(BST classA, BST classB, BST classC) {
        this.root = new IPAddressNode(classA,classB,classC);
    }
    public void insert(ClassArray classArray){
        if (root.left.root == null){
            root.left.root = new Node(classArray.classA[0]);
        }
        if (root.middle.root == null){
            root.middle.root = new Node(classArray.classA[0]);
        }
        if (root.right.root == null){
            root.right.root = new Node(classArray.classC[0]);
        }

    }
}
