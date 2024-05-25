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
        String[] faculties = {"S","MED","A","MG","AHS","VS","E","AG","D"};
        for (int i = 0; i < faculties.length; i++) {
            if (regNo.toUpperCase().trim().split("/")[0].equals(faculties[i])){
                return i;
            }
        }
        return 9;
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
            System.out.print(i+"  :  ");
            hashTable[i].display();
            System.out.println();
        }
    }
}
