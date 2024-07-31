package End2021.Paper1.Q2;

public class BST {
    Node root;

    public BST() {
        this.root = new Node(' ', "");
    }

    public void insert(char letter, String morse) {
        insertRec(root, letter, morse, 0);
    }

    private void insertRec(Node root, char letter, String morseCode, int index) {
        if (index < morseCode.length()) {
            if (morseCode.charAt(index) == '.') {
                if (root.left == null) {
                    root.left = new Node(' ', "");
                }
                insertRec(root.left, letter, morseCode, index + 1);
            } else if (morseCode.charAt(index) == '-') {
                if (root.right == null) {
                    root.right = new Node(' ', "");
                }
                insertRec(root.right, letter, morseCode, index + 1);
            }
        } else {
            root.getLetter().setLetter(letter);
            root.getLetter().setMorse(morseCode);
        }
    }
    
    public Node searchByLetter(char letter){
        return searchByLetterRec(root,letter);
    }
    private Node searchByLetterRec(Node root, char letter){
        if (root == null) return root;
        else if (root.getLetter()!=null && root.getLetter().getLetter() == letter){
            return root;
        } else {
            Node ret = searchByLetterRec(root.left,letter);
            if (ret == null){
                ret = searchByLetterRec(root.right,letter);
            }
            return ret;
        }
    }

    public char searchByMorse(String morse){
        if (morse.isEmpty()){
            return ' ';
        }
        Node temp = root;
        for (int i = 0; i < morse.length(); i++) {
            if (morse.charAt(i) == '.'){
                temp = temp.left;
            } if (morse.charAt(i) =='-'){
                temp = temp.right;
            }
        }
        if (temp == null) return ' ';
        return temp.getLetter().getLetter();
    }

    public void decrypt(String morse){
        StringBuilder sb = new StringBuilder();
        String[] morseCodes = morse.split("/");
        for (int i = 0; i < morseCodes.length; i++) {
            if (searchByMorse(morseCodes[i])!='\0'){
                sb.append(searchByMorse(morseCodes[i]));
            }
        }
        System.out.println(sb);
    }
    public void encrypt(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (searchByLetter(word.charAt(i)).getLetter()==null){
                sb.append("/");
            } else sb.append(searchByLetter(word.charAt(i)).getLetter().getMorse() + "/");
        }
        System.out.println(sb);
    }



}
