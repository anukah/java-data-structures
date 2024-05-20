package End2021.Q2;
public class BST {
    Node root;
    public BST() {
        this.root = new Node('\0', "");
    }
    public void insert(char character, String characterCode) {
        root = insertHelper(root, character, characterCode, 0);
    }
    private Node insertHelper(Node root, char character, String characterCode, int index) {
        if (index == characterCode.length()) {
            return new Node(character, characterCode);
        }
        if (characterCode.charAt(index) == '0') {
            root.left = insertHelper(root.left, character, characterCode, index + 1);
        } else if (characterCode.charAt(index) == '1') {
            root.right = insertHelper(root.right, character, characterCode, index + 1);
        }
        return root;
    }
    public void inOrder() {
        inOrderHelper(root);
    }
    private void inOrderHelper(Node root) {
        if (root != null) {
            inOrderHelper(root.left);
            if (root.getCharacter() != '\0') {
                System.out.println(root.getCharacter() + ": " + root.getCharacterCode());
            }
            inOrderHelper(root.right);
        }
    }

    public void encrypt(String data){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (c == ' '){sb.append('@');}
            else if(Character.isLowerCase(c)){sb.append(generateEncryptionCode(c)+"_"+i);}
            else sb.append(c);

            if (i<data.length() - 1){
                sb.append("/");
            }
        }
        System.out.println(sb.toString());
    }

    private Node search(char data){ return searchHelper(root,data);}
    private Node searchHelper(Node root, char data){
        if (root == null || root.getCharacter() == data){
            return root;
        }
        if(data< root.getCharacter()){
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }
    private String generateEncryptionCode(char data){
        Node node = search(data);
        if (node!=null) return root.getCharacter() + "_" + root.getCharacterCode();
        else return null;
    }
}
