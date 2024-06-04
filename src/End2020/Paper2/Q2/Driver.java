package End2020.Paper2.Q2;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        String[] arr = HelperClass.readLinesToArray();
        String[] trimmed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            trimmed[i] = arr[i].trim();
        }
        BST bst = new BST();
        bst.insert(trimmed);
        System.out.println(bst.root.getTagName());
        if (bst.root.left != null) {
            System.out.println(bst.root.left.getTagName());
        }

    }

}
