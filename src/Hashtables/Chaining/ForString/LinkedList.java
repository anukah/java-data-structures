package Hashtables.Chaining.ForString;
public class LinkedList{
    Node head;
    Node tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void insertRear(String data, int key){
        Node node = new Node(data, key);
        if (head == null){
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }
    public Node retrieve(String data){
        Node returnData = null;
        if (head == null){return null;}
        if (head.getData().equals(data)){
            returnData = head;
            head = head.getNext();
            return returnData;
        }
        Node temp = head;
        while(temp.next != null){
            if (temp.next.getData().equals(data)){
                returnData = temp.getNext();
                temp.setNext(temp.getNext().getNext());
                if (temp.getNext() == null){
                    tail = temp;
                }
                temp = temp.getNext();
            }
        }
        return returnData;
    }

    public Node contains(String data){
        Node temp = head;
        while(temp!=null){
            if (temp.getData().equals(data)){
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }
    public void display(){
        if(head!=null){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.getData()+", ");
            temp = temp.getNext();
            }
        }
        System.out.println();
    }


}
