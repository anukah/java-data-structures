package End2021.Paper2.Q2;


public class BST {
    Node root;

    public BST() {
        this.root = null;
    }

    public void insert(char character, String characterCode) {
        root = insertRec(root, character, characterCode, 0);
    }

    private Node insertRec(Node root, char character, String characterCode, int index) {
        if (root == null) {
            if (index == characterCode.length()) {
                return new Node(character, characterCode);
            } else {
                root = new Node(' ', "");
            }
        }
        if (index < characterCode.length()) {
            if (characterCode.charAt(index) == '0') root.left = insertRec(root.left, character, characterCode, index + 1);
            else if (characterCode.charAt(index) == '1') root.right = insertRec(root.right, character, characterCode, index + 1);
        } else {
            root.getLetter().setCharacter(character);
            root.getLetter().setCharacterCode(characterCode);
        }
        return root;
    }

    public Node searchByCharacter(char character) {
        character = Character.toLowerCase(character);
        Node ret = searchByCharacterRec(root, character);
        return (ret == null) ? null : ret;
    }

    private Node searchByCharacterRec(Node root, char character) {
        if (root == null) return null;
        else if (root.getLetter() != null && root.getLetter().getCharacter() == character) {
            return root;
        } else {
            Node ret = searchByCharacterRec(root.left, character);
            if (ret == null) ret = searchByCharacterRec(root.right, character);
            return ret;
        }
    }

    public void encrypt(String phrase) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') sb.append("@/");
            else if (phrase.charAt(i) == ',' && i + 1 < phrase.length() && phrase.charAt(i + 1) == '@') {
                sb.append(",/");
                i++;
            } else {
                Node node = searchByCharacter(phrase.charAt(i));
                if (node != null && node.getLetter() != null) {
                    sb.append(node.getLetter().getCharacterCode() + "_" + (i + 1) + "/");
                }
            }
        }
        System.out.println(sb.toString());
    }

    public void decrypt(String toDecrypt) {
        StringBuilder sb = new StringBuilder();
        String[] dec = toDecrypt.toLowerCase().strip().split("/");

        for (String morseCode : dec) {
            if (!morseCode.equals("")) {
                if (morseCode.equals(",@")) {
                    sb.append(',');
                } else if (morseCode.equals("@")) {
                    sb.append(" ");
                } else {
                    String characterCode = morseCode.split("_")[0];
                    char letter = searchByCharacterCode(characterCode);
                    sb.append(letter);
                }
            }
        }
        System.out.println(sb.toString());
    }

    public char searchByCharacterCode(String characterCode) {
        if (characterCode.equals("@")) {
            return ' ';
        }
        Node temp = root;
        for (int i = 0; i < characterCode.length(); i++) {
            if (characterCode.charAt(i) == '0') {
                temp = temp.left;
            } else if (characterCode.charAt(i) == '1') {
                temp = temp.right;
            }
            if (temp == null || temp.getLetter() == null) {
                return ' ';
            }
        }
        return temp.getLetter().getCharacter();
    }
}
