package End2022.Paper2.Q2;

public class Node {
    private String word;
    private int token;
    protected Node left;
    protected Node right;

    public Node(String word, int token) {
        this.word = word;
        this.token = token;
        this.left = null;
        this.right = null;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
