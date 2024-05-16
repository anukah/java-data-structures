package LinkedLists.Singly;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFront(1);
        list.insertRear(2);
        list.insertRear(3);
        list.insertNext(4,2);
        list.delete(3);
        list.delete(1);
        System.out.println(list.nodeExists(1));
        list.display();
    }
}
