package BinarySearchTrees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertNode(50);
        binarySearchTree.insertNode(30);
        binarySearchTree.insertNode(60);
        binarySearchTree.insertNode(10);
        binarySearchTree.insertNode(45);
        binarySearchTree.insertNode(55);
        binarySearchTree.insertNode(70);
        binarySearchTree.deleteNode(30);
        binarySearchTree.bfs();
        binarySearchTree.dfs();
        binarySearchTree.preorder();
        System.out.println();
        binarySearchTree.inorder();
        System.out.println();
        binarySearchTree.postorder();
        binarySearchTree.searchLevel(50);
        System.out.println(binarySearchTree.search(50).key);
    }
}
