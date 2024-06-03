package End2020.Paper1.Q2;

public class BST {
    Node root;
    public BST(Node root) {
        this.root = null;
    }

    public void insert(String address){root = insertHelper(root,address);}
    private Node insertHelper(Node root, String address) {
        if (root == null) {
            root = new Node(address);
        } else {
            Node node = new Node(address);
            if (getFirstOctet(node) < getFirstOctet(root)) {
                root.left = insertHelper(root.left,address);
            } else if (getFirstOctet(root) < getFirstOctet(node)){
                root.right = insertHelper(root.right,address);
            }
        }
        return null;
    }

    private Integer getFirstOctet(Node node){
        return Integer.parseInt(node.getIp_address().trim().split(".")[0]);
    }
}
