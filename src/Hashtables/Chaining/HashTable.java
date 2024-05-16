package Hashtables.Chaining;

public class HashTable {
    public LinkedList[] hashtable;
    public HashTable(int arraySize) {
        this.hashtable = new LinkedList[arraySize];
        for (int i = 0; i < arraySize; i++) {
            hashtable[i] = new LinkedList();
        }
    }
    public int hashCode(int data){
        return data % hashtable.length;
    }
    public void insert(int data){hashtable[hashCode(data)].insertRear(data);}
    public void delete(int data){hashtable[hashCode(data)].delete(data);}

    public void display(){
        for (int i = 0; i < hashtable.length; i++) {
            System.out.print(i + " : ");
            hashtable[i].display();
        }
        System.out.println();
    }
}
