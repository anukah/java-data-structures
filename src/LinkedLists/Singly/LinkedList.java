package LinkedLists.Singly;

public class LinkedList{
    Node head;
    Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        } else {
            return false;
        }
    }

    public Node search(int value){
        if(head == null){
            return null;
        }
        if(head.getData() == value){
            return head;
        } else {
            Node temp = head;
            while(temp!=null){
                if(temp.getData() == value){
                    return temp;
                }
                temp = temp.getNext();
            }
        }
        return null;
    }

    public boolean nodeExists(int value){
        if(head.getData() == value){
            return true;
        } else {
            Node temp = head;
            while(temp!=null){
                if (temp.getData() == value){
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }

        System.out.println();
    }

    public void insertFront(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void insertRear(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public void insertNext(int value, int prev) {
        Node node = new Node(value);
        Node temp = head;
        while(temp!=null){
            if(temp.getData() == prev){
                node.setNext(temp.getNext());
                temp.setNext(node);
                return;
            }
            temp = temp.getNext();
        }
        System.out.println("prev node does not exist!");
    }

    public void delete(int value){
        if(head == null){
            return;
        }
        if(head.getData() == value){
            head = head.getNext();
            return;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.getNext().getData() == value){
                temp.setNext(temp.getNext().getNext());
                return;
            }
            temp = temp.getNext();
        }
        System.out.println("value does not exist!");
    }
}