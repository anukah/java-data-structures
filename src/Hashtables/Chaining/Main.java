package Hashtables.Chaining;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
        ht.insert(3);
        ht.insert(8);
        ht.display();
        ht.delete(3);
        ht.display();
        ht.delete(8);
        ht.display();
    }
}
