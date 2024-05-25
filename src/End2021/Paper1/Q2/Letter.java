package End2021.Paper1.Q2;

public class Letter {
    private char character;
    private String morse;
    public Letter(char letter, String morse) {
        this.character = letter;
        this.morse = morse;
    }
    public char getCharacter() {
        return character;
    }

    public void setCharacter(char letter) {
        this.character = letter;
    }

    public String getMorse() {
        return morse;
    }

    public void setMorse(String morse) {
        this.morse = morse;
    }
}
