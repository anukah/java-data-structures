package End2020.Paper2.Q2;

public class BST {
    Node root;
    public BST() {
        this.root = null;
    }
    public void insert(String[] tags) {
        boolean lastWasClosing = false;
        for (String tag : tags) {
            TAG_TYPE tagType = HelperClass.getTagType(tag);
            if (tagType == TAG_TYPE.opening) {
                root = insertHelper(root, tag, lastWasClosing);
                lastWasClosing = false;
            } else if (tagType == TAG_TYPE.closing) {
                lastWasClosing = true;
            }
        }
    }
    private Node insertHelper(Node root, String tag, boolean lastWasClosing) {
        if (root == null) {
            return new Node(tag);
        }
        if (lastWasClosing) {
            root.right = insertHelper(root.right, tag, false);
        } else {
            root.left = insertHelper(root.left, tag, false);
        }
        return root;
    }
}
