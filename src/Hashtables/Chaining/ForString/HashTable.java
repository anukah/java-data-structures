package Hashtables.Chaining.ForString;
public class HashTable {
    public LinkedList[] hashtable;
    public HashTable(int size) {
        this.hashtable = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashtable[i] = new LinkedList();
        }
    }
    public int hashcode(int data){return data%hashtable.length;}
    public void insert(String data, int key){hashtable[hashcode(key)].insertRear(data,key);}
    public Node retrieve(String data) {
        int key = -1;
        for (int i = 0; i < hashtable.length; i++) {
            Node node = hashtable[i].retrieve(data);
            if (node != null) {
                key = node.getKey();
                return node;
            }
        }
        hashtable[key].retrieve(data);
        return null;
    }

    public void display(){
        for (int i = 0; i < hashtable.length; i++) {
            System.out.print(i + " : ");
            hashtable[i].display();
        }
        System.out.println();
    }
}
