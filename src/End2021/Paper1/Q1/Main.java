package End2021.Paper1.Q1;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.insert("S/21/111","Amila",27,"Male","Karate");
        ht.search("S/21/111");
//        ht.delete("S/21/111");
//        ht.search("S/21/111");
        ht.display();
    }
}
