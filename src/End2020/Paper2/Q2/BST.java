package End2020.Paper2.Q2;

public class BST {
    Node root;
    public BST() {
        this.root = new Node("pdnml");
    }
    public void insert(String tag){
        root = insertHelper(root, tag);
    }
    private Node insertHelper(Node root, String tag){
        TAG_TYPE tag_type = HelperClass.getTagType(tag);
        if (root == null){
            return new Node(tag);
        } else {
            if (tag_type == TAG_TYPE.opening){
                root.left = insertHelper(root.left,tag);
            } else if (tag_type == TAG_TYPE.closing) {
                return root;
            }
        }
        return root;
    }
    public void display() {
        displayHelper(root);
    }
    private void displayHelper(Node node) {
        if (node != null) {
            displayHelper(node.left);
            System.out.print(node.getTagName()+", ");
            displayHelper(node.right);
        }
    }


}
