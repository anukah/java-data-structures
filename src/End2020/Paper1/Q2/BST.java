package End2020.Paper1.Q2;

public class BST {
    TreeNode root;
    public BST() {
        this.root = null;
    }
    public void insert(String ip){
        root = insertHelper(root, ip);
    }
    private TreeNode insertHelper (TreeNode root,String ip){
        TreeNode node = new TreeNode(ip);
        if (root == null) return node;
        else{
            if (getVal(root.getIpAddress())>getVal(ip)) root.left = insertHelper(root.left,ip);
            else root.right = insertHelper(root.right, ip);
        }
        return root;
    }

    private int getVal(String ip){return Integer.parseInt(ip.strip().split("\\.")[0]);}

    public String atLevel(int level){
        if (root != null) {
            return getLevelHelper(root, level, 0).trim();
        }
        return "";
    }

    private String getLevelHelper(TreeNode root, int level, int start){
        if (root == null) return "";
        if (start == level) return root.getIpAddress() + " ";
        String left = getLevelHelper(root.left, level, start + 1);
        String right = getLevelHelper(root.right, level, start + 1);
        return left + right;
    }

    public void display() {
        displayHelper(root);
    }
    private void displayHelper(TreeNode root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.print(root.getIpAddress() + ", ");
            displayHelper(root.right);
        }
    }

    public void delete(String ip){
        root = deleteHelper(root, ip);
    }

    private TreeNode deleteHelper(TreeNode root, String ip){
        if (root == null) return null;
        if (getVal(ip) < getVal(root.getIpAddress())) {
            root.left = deleteHelper(root.left, ip);
        } else if (getVal(ip) > getVal(root.getIpAddress())) {
            root.right = deleteHelper(root.right, ip);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.setIpAddress(minValue(root.right));
            root.right = deleteHelper(root.right, root.getIpAddress());
        }
        return root;
    }

    private String minValue(TreeNode root){
        String min = root.getIpAddress();
        while (root.left != null) {
            min = root.left.getIpAddress();
            root = root.left;
        }
        return min;
    }

}
