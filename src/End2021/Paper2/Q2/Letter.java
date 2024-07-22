package End2021.Paper2.Q2;

public class Letter {
    private char character;
    private String characterCode;
    public Letter(char character, String characterCode) {
        this.character = character;
        this.characterCode = characterCode;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getCharacterCode() {
        return characterCode;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }
}
