package End2021.Paper1.Q2;

public class Letter {
    private char letter;
    private String morse;
    public Letter(char letter, String morse) {
        this.letter = letter;
        this.morse = morse;
    }
    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getMorse() {
        return morse;
    }

    public void setMorse(String morse) {
        this.morse = morse;
    }
}
