package End2020.Paper1.Q2;

public class BST {
    Node root;
    public BST() {
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
        return root;
    }
    private int getFirstOctet(Node node){
        return Integer.parseInt(node.getIp_address().trim().split("\\.")[0]);
    }

    public String display(){
        StringBuilder sb = new StringBuilder();
        displayHelper(root, sb);
        if (sb.length()>2) {
            sb.substring(sb.length()-2);
        }
        return sb.toString();
    }
    public void displayHelper(Node root, StringBuilder sb){
        if (root!=null){
            displayHelper(root.left,sb);
            sb.append(root.getIp_address()).append(", ");
            displayHelper(root.right,sb);
        }
    }

}
