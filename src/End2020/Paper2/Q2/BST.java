package End2020.Paper2.Q2;

class BST {
    Node root;

    BST() {
        root = null;
    }

    void insert(String tag, boolean isAfterClosingTag) {
        root = insertRec(root, tag, isAfterClosingTag);
    }

    private Node insertRec(Node root, String tag, boolean isAfterClosingTag) {
        if (root == null) {
            root = new Node(tag);
            return root;
        }

        if (isAfterClosingTag) {
            if (root.right == null) {
                root.right = new Node(tag);
            } else {
                insertRec(root.right, tag, isAfterClosingTag);
            }
        } else {
            if (root.left == null) {
                root.left = new Node(tag);
            } else {
                insertRec(root.left, tag, isAfterClosingTag);
            }
        }

        return root;
    }


    void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.getTagName());
            inorderRec(root.right);
        }
    }
}