package Hashtables.Chaining.ForString;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
        ht.insert("A", 3);
        ht.insert("Z", 2);
        ht.insert("B", 3);
        ht.display();
        ht.retrieve("A");
        ht.display();
    }
}
