package End2022.Paper1.Q1;

public class PriorityQueue {
    Node front;
    Node rear;
    public PriorityQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){return front==null;}

    public void enqueue(String regNo, float time, String items, float total) {
        Node node = new Node(regNo, time, items, total);
        if (isEmpty()) {
            front = node;
            rear = node;
            return;
        }
        if (node.getOrder().getTotal() > 30) {
            if (front.getOrder().getTotal() <= 30 || node.getOrder().getTime() < front.getOrder().getTime()) {
                node.setNext(front);
                front = node;
                return;
            }

            Node current = front;
            while (current.getNext() != null && current.getNext().getOrder().getTotal() > 30 && current.getNext().getOrder().getTime() <= node.getOrder().getTime()) {
                current = current.getNext();
            }

            node.setNext(current.getNext());
            current.setNext(node);

            if (node.getNext() == null) {
                rear = node;
            }

            return;
        }
        if (front.getOrder().getTotal() > 30) {
            Node current = front;
            while (current.getNext() != null && current.getNext().getOrder().getTotal() > 30) {
                current = current.getNext();
            }

            if (current.getNext() == null || node.getOrder().getTime() < current.getNext().getOrder().getTime()) {
                node.setNext(current.getNext());
                current.setNext(node);
                return;
            }

            while (current.getNext() != null && current.getNext().getOrder().getTime() <= node.getOrder().getTime()) {
                current = current.getNext();
            }

            node.setNext(current.getNext());
            current.setNext(node);

            if (node.getNext() == null) {
                rear = node;
            }

            return;
        }
        rear.setNext(node);
        rear = node;
    }

    public void firstOrder(){
        if (isEmpty()) System.out.println("Empty Queue.");
        Node ret = front;
        Node temp = front.getNext();
        while (temp != null) {
            if (temp.getOrder().getTime() < ret.getOrder().getTime()) {
                ret = temp;
            }
            temp = temp.getNext();
        }
        System.out.println(ret.getOrder().getRegNo());

    }
    public void dequeue(){
        if (!isEmpty()) {
            front = front.next;
        }
    }

    public void display(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.getOrder().getRegNo()+ ", ");
            temp = temp.next;
        }
    }


}
