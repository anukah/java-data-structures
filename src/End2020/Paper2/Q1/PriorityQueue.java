package End2020.Paper2.Q1;

public class PriorityQueue {
    Node front;
    Node rear;
    public PriorityQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            if (front.getData() > data) {
                node.next = front;
                front = node;
            } else if (rear.getData() < data) {
                rear.next = node;
                rear = node;
            } else {
                Node temp = front;
                while (temp.next != null && temp.next.getData() < data) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
            }
        }
    }

    public void dequeue(){}

    public void display(){
        Node temp = front;
        while (temp!=null){
            System.out.print(temp.getData() + ", ");
            temp = temp.next;
        }
    }






}
