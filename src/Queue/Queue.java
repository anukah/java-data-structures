package Queue;

public class Queue {
    Node front;
    Node rear;
    int queueLength;
    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void enqueue(int data){
        Node node = new Node(data);
        if (isEmpty()){
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        queueLength++;
    }
    public void dequeue(){
        if (isEmpty()){
            System.out.println("Empty!");
        } else {
            if (front.getNext()!= null){
                front = front.getNext();
            } else {
                front = null;
                rear = null;
            }
            queueLength--;
        }
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Empty!");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.getData() + ", ");
                temp = temp.getNext();
            }
        }
    }
    public void queuePosition(int position){
        Node temp  = front;
        if (isEmpty()){
            display();
            return;
        }
        if(position<=queueLength) {
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
        } else {
            System.out.println();
            System.out.println("Queue not that long!");
            return;
        }
        System.out.println();
        System.out.println(temp.getData());

    }

}
