package End2022.Paper2.Q2;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert("city",6);
        bst.insert("birdwatcher", 5);
        bst.insert("Kandy",10);
        bst.insert("white",3);
        bst.insert("the", 4);
        bst.insert("to",15);
        bst.insert("has",12);
        bst.insert("come",16);
        bst.postOrder();
        bst.delete("has");
        System.out.println();
        bst.postOrder();
        bst.insert("might", 11);
        bst.insert("not", 17);
        System.out.println();
        bst.postOrder();
        System.out.println();
        bst.bfs("Kandy");
        System.out.println();
        bst.dfs("Kandy");
    }
}
