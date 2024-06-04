package End2020.Paper2.Q2;

import java.io.IOException;
public class Driver {
    public static void main(String[] args) throws IOException {
        String[] arr = HelperClass.readLinesToArray();
        String[] trimmed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            trimmed[i] = arr[i].trim();
        }
        for (String s:trimmed) {
            System.out.println(s);
        }
//        BST bst = new BST();
//        bst.insert(trimmed);
//        bst.inOrder();
    }

}
