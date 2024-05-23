package End2021.Paper1.Q2;

public class Node {
    private Letter letter;
    protected Node left;
    protected Node right;

    public Node(char letter, String morse) {
        this.letter = new Letter(letter, morse);
        this.left = null;
        this.right = null;
    }
    public Letter getLetter() {
        return letter;
    }
}
