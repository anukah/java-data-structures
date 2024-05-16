package Hashtables.Chaining;

public class LinkedList {
    Node head;
    Node tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void insertRear(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }
    public void delete(int data) {
        if (head == null) return;
        if (head.getData() == data) {
            head = head.getNext();
            if (head == null) tail = null;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getNext().getData() == data) {
                temp.setNext(temp.getNext().getNext());
                if (temp.getNext() == null) tail = temp;
                return;
            }
            temp = temp.getNext();
        }
        System.out.println("not exist!");
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }
        System.out.println();
    }

}
