package LinkedLists.Singly;

public class LinkedList {
    Node head;
    Node tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){return head == null;}
    public boolean nodeExists(int val){return false;}
    public void insertFront(int data){
        Node node = new Node(data);
        if (isEmpty()){
            tail = node;
        } else {
            node.setNext(head);
        }
        head = node;
    }
    public void insertRear(int data){
        Node node = new Node(data);
        if (isEmpty()){
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;

    }
    public void insertNext(int prev, int data){
        if (isEmpty()) return;
        Node node = new Node(data);
        if (tail.getData() == prev){
            tail.setNext(node);
            tail = node;
        } else {
            Node temp = head;
            while (temp!=null){
                if (temp.getData() == prev){
                    node.setNext(temp.next);
                    temp.setNext(node);
                    return;
                }
                temp = temp.next;
            }
        }
    }
    public Node search(int val){
        if (!isEmpty()){
            Node temp = head;
            while (temp!=null){
                if (temp.getData() == val){
                    return temp;
                }
                temp = temp.next;
            }
        }
        return null;}
    public void delete(int val){
        if (isEmpty()) return;
        if (head.getData() == val){
            head = head.next;
            if (head == null){
                tail = null;
            }
        } else {
            Node temp = head;
            while (temp.next != null){
                if (temp.next.getData() == val){
                    temp.setNext(temp.next.next);
                    if (temp.getNext() == null){
                        tail = temp;
                    }
                    return;
                }
                temp = temp.next;
            }
        }
    }
    public void display(){
        if (isEmpty()) return;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.getData() + ", ");
            temp = temp.next;
        }
    }


}
