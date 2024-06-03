package End2020.Paper2.Q2;

import java.io.IOException;
public class Driver {
    public static void main(String[] args) throws IOException {
        BST bst = new BST();
        String[] lines = HelperClass.readLinesToArray();

        boolean isAfterClosingTag = false;
        for (String line : lines) {
            TAG_TYPE tagType = HelperClass.getTagType(line.trim());
            if (tagType == TAG_TYPE.closing) {
                isAfterClosingTag = true;
            } else if (tagType == TAG_TYPE.opening) {
                bst.insert(line, isAfterClosingTag);
                isAfterClosingTag = false;
            }
        }

        // Print the inorder traversal of the BST
        bst.inorder();
    }
}
