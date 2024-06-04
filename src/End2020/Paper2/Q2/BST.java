package End2020.Paper2.Q2;

public class BST {
    Node root;
    public BST() {
        this.root = null;
    }

    public void insert(String[] line){
        for (int i = 0; i < line.length; i++) {
            if (i+1 != line.length) {
                root = insertRec(this.root, line[i], line[i+1]);
            }
        }
    }

    public Node insertRec(Node root,String line, String nextLine){
        Node newNode = new Node(line);
        if(root == null){
            if (HelperClass.getTagType(nextLine) == TAG_TYPE.content) {
                newNode.setContent(HelperClass.getVar(nextLine)[0]);
            }
            return newNode;
        }else{
            if(HelperClass.getTagType(line) == TAG_TYPE.opening) {
                if(HelperClass.getTagType(nextLine) == TAG_TYPE.closing){
                    root.closed = true;
                }
                if(root.left != null){
                    if(root.left.closed){
                        root.right = insertRec(root.right, line, nextLine);
                    }else{
                        root.left = insertRec(root.left, line, nextLine);
                    }
                }else {
                    root.left = insertRec(null, line, nextLine);
                }
            }
        }
        return root;
    }
    public void inOrder(){
        inOrderRec(root);
    }
    private void inOrderRec(Node root){
        if (root!=null) {
            inOrderRec(root.left);
            System.out.println(root.getTagName());
            inOrderRec(root.right);
        }
    }

}

