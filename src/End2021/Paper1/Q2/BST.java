package End2021.Paper1.Q2;

public class BST {
    Node root;
    public BST() {
        this.root = new Node('\0'," ");
    }
    public void insert(char letter, String morse) {
        root = insertHelper(root, letter, morse, 0);
    }

    private Node insertHelper(Node root, char letter, String morse, int index) {
        if (root == null) {
            root = new Node(letter, morse);
        }
        if (index < morse.length()) {
            if (morse.charAt(index) == '.') {
                root.left = insertHelper(root.left, letter, morse, index + 1);
            } else if (morse.charAt(index) == '-') {
                root.right = insertHelper(root.right, letter, morse, index + 1);
            }
        }
        return root;
    }
    private Node searchByLetter(char letter) {
        return searchByLetterHelper(root, letter);
    }

    private Node searchByLetterHelper(Node root, char letter) {
        if (root == null) return null;
        if (root.getLetter().equals(letter)){
            return root;
        } else {
            Node leftSearch = searchByLetterHelper(root.left, letter);
            if (leftSearch != null) {
                return leftSearch;
            }
            return searchByLetterHelper(root.right, letter);
        }
    }

    public void encrypt(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.toLowerCase().charAt(i);
            Node node = searchByLetter(c);
            if (node != null) {
                sb.append(node.getLetter().getMorse()).append("/");
            } else {
                System.out.println("Error: Character " + c + " not found in the tree!");
            }
        }
        System.out.println(sb.toString());
    }

}
