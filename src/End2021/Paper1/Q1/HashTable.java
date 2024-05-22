package End2021.Paper1.Q1;

public class HashTable {
    LinkedList[] hashTable;
    int size;
    public HashTable(int size) {
        this.size = size;
        this.hashTable = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.hashTable[i] = new LinkedList();
        }
    }
    private int hashFunction(String regNo){
        String[] parts = regNo.toUpperCase().trim().split("/");
        switch (parts[0]) {
            case "S": return 0;
            case "MED": return 1;
            case "A": return 2;
            case "MG": return 3;
            case "AHS": return 4;
            case "VS": return 5;
            case "E": return 6;
            case "AG": return 7;
            case "D": return 8;
            default: return 9;
        }
    }
    public void insert(String regNo, String name, int age, String gender, String events){
        hashTable[hashFunction(regNo)].insertRear(regNo, name, age, gender, events);
    }
    public void search(String regNo){
        hashTable[hashFunction(regNo)].search(regNo);
    }
    public Node delete(String regNo){
        hashTable[hashFunction(regNo)].delete(regNo);
        return null;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(i+"  :  ");
            hashTable[i].display();
        }
    }
}
