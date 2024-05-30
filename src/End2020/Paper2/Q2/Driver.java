package End2020.Paper2.Q2;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        BST bst = new BST();
        String[] arr = HelperClass.readLinesToArray();
        for (int i = 1; i < arr.length; i++) {
            bst.insert(arr[i]);
        }
        bst.display();
    }
}
