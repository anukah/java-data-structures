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
            sb.setLength(sb.length()-2);
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

    public void getIPAtLevel(int level, StringBuilder sb){
        getIPAtLevelHelper(root,level,0,sb);
    }

    private void getIPAtLevelHelper(Node root, int level, int currentLevel, StringBuilder sb){
        if (root == null){
            return;
        }if (level == currentLevel){
            sb.append(root.getIp_address()).append(", ");
        } else {
            getIPAtLevelHelper(root.left, level,currentLevel+1, sb);
            getIPAtLevelHelper(root.right, level,currentLevel+1, sb);
        }
    }
    public void removeHighest() {
        root = removeHighestHelper(root);
    }
    private Node removeHighestHelper(Node root) {
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return root.left;
        }
        root.right = removeHighestHelperRecursive(root.right);
        return root;
    }

    private Node removeHighestHelperRecursive(Node root) {
        if (root.right == null) {
            return root.left;
        }
        root.right = removeHighestHelperRecursive(root.right);
        return root;
    }

    public String findMax(){
        if (root == null){
            return null;
        }
        Node node = root;
        while (node.right!=null){
            node = node.right;
        }
        return node.getIp_address();
    }

}
