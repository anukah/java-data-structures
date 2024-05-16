package LinkedLists.Doubly;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFront(1);
        list.insertRear(2);
        list.insertNext(4,1);
        list.delete(1);
        System.out.println(list.nodeExists(1));
        list.display();
    }
}
