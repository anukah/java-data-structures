package End2021.Paper2.Q2;

class Node {
    private char character;
    private String characterCode;
    protected Node left;
    protected Node right;
    public Node(char character, String characterCode) {
        this.character = character;
        this.characterCode = characterCode;
        this.left = null;
        this.right = null;
    }
    public char getCharacter() {
        return character;
    }
    public String getCharacterCode() {
        return characterCode;
    }
}
