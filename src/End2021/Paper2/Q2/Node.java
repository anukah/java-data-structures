package End2021.Paper2.Q2;

public class Node {
    private Letter letter;
    protected Node left;
    protected Node right;

    public Node(char character, String characterCode) {
        this.letter = new Letter(character, characterCode);
        this.left = null;
        this.right = null;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }
}
