package End2021.Paper1.Q2;

public class Main {
    public static void main(String[] args) {
        char[] letters = {'h','e','l','o','w','r','d','t','i','a','n','s','m','u','c','y','k','q','z','b', 'v','g','f','x','j','p'};
        String[] morseCode = {"....",".",".-..","---",".--",".-.","-..","-","..",".-","-.","...","--","..-","-.-.","-.--","-.-","--.-","--..","-...","...-","--.","..-.","-..-",".---",".--."};
        BST bst = new BST();
        for (int i = 0; i < letters.length; i++) {
            bst.insert(letters[i],morseCode[i]);
        }
        bst.inOrder();
        //bst.encrypt("hello");
    }
}
