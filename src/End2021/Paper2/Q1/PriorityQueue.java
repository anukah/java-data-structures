package End2021.Paper2.Q1;

public class PriorityQueue {
    Node front;
    Node rear;
    public PriorityQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){return front == null;}
    public void insert(int data){
        Node node = new Node(data);
        if (isEmpty()){
            front = node;
            rear = node;
        } else if (data < front.getData()) {
            node.next = front;
            front = node;
        } else if (data > rear.getData()){
            rear.next = node;
            rear = node;
        } else {
            Node temp = front;
            while (temp.next!=null && temp.next.getData() < data){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void display(){
        if (!isEmpty()){
            Node temp = front;
            while(temp.next!=null){
                System.out.print(temp.getData() + ", ");
                temp = temp.next;
            }
        } else System.out.println("Empty Queue!");
    }
}
