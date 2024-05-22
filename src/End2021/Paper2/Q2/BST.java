package End2021.Paper2.Q2;
public class BST {
    Node root;

    public BST() {
        this.root = new Node('\0', "");
    }

    public void insert(char character, String characterCode) {
        root = insertHelper(root, character, characterCode, 0);
    }

    private Node insertHelper(Node root, char character, String characterCode, int index) {
        if (root == null) {
            root = new Node(character, characterCode);
        }
        if (index < characterCode.length()) {
            if (characterCode.charAt(index) == '0') {
                root.left = insertHelper(root.left, character, characterCode, index + 1);
            } else if (characterCode.charAt(index) == '1') {
                root.right = insertHelper(root.right, character, characterCode, index + 1);
            }
        }
        return root;
    }
    public Node searchByCharacter(char character) {
        return searchByCharacterHelper(root, character);
    }

    private Node searchByCharacterHelper(Node root, char character) {
        if (root == null) {
            return null;
        }
        if (root.getCharacter() == character) {
            return root;
        }
        Node leftSearch = searchByCharacterHelper(root.left, character);
        if (leftSearch != null) {
            return leftSearch;
        }
        return searchByCharacterHelper(root.right, character);
    }

    public Node searchByCharacterCode(String characterCode) {
        return searchByCharacterHelper(root, characterCode);
    }

    private Node searchByCharacterHelper(Node root, String characterCode) {
        if (root == null) {
            return null;
        }
        if (root.getCharacterCode().equals(characterCode)){
            return root;
        }
        Node leftSearch = searchByCharacterHelper(root.left, characterCode);
        if (leftSearch != null) {
            return leftSearch;
        }
        return searchByCharacterHelper(root.right, characterCode);
    }

    public void encrypt(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.toLowerCase().charAt(i);
            if (c == ' ') {
                sb.append("@/");
            } else {
                Node node = searchByCharacter(c);
                if (node != null) {
                    sb.append(node.getCharacterCode()).append("_").append(i).append("/");
                } else {
                    sb.append(c).append("_").append(i).append("/");
                }
            }
        }
        System.out.println(sb);
    }

    public void decrypt(String encryptedString) {
        StringBuilder sb = new StringBuilder();
        String[] parts = encryptedString.split("/");
        for (String part : parts) {
            if (part.equals("@")) {
                sb.append(" ");
            } else if (!part.isEmpty()) {
                String[] subParts = part.split("_");
                String code = subParts[0];
                Node node = searchByCharacterCode(code);
                if (node != null) {
                    sb.append(node.getCharacter());
                } else {
                    sb.append(code);
                }
            }
        }
        System.out.println(sb);
    }
}