package End2021.Q2;

public class Main {
    public static void main(String[] args) {
        char[] characters = {'e','t','o','l','y','r','i','u','v','n','d','a','s','h','g','x','w','p','b','z','q','m','k','j','f','c'};
        String[] characterCodes = {"0","00","01","000","001","010","011","0000","0001","0010","0011","0100","0101","1","10","11","100","101","110","111","1000","1001","1010","1011","1100","1101"};
        BST bst = new BST();
        for (int i = 0; i < characters.length; i++) {
            bst.insert(characters[i],characterCodes[i]);
        }
        bst.encrypt("“Defend Paris to the last, destroy all bridges over the Seine and devastate the city”.");
        bst.decrypt("0010_0/01_1/010_2/1001_3/0100_4/0010_5/0011_6/001_7/@/011_9/0101_10/@/0011_12/01_13/100_14/0010_15/,/@/0100_18/000_19/000_20/@/1100_22/01_23/010_24/1101_25/0_26/0101_27/@/010_29/0_30/00_31/010_32/0_33/0100_34/00_35/");
    }
}
