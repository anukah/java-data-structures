package End2020.Paper2.Q1;

public class Queue {
    QueueNode front;
    QueueNode rear;
    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void enqueue(int data){
        QueueNode node = new QueueNode(data);
        if (isEmpty()){
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }
    public int dequeue(){
        int returnNode = 0;
        if (!isEmpty()){
            returnNode = front.data;
            front = front.next;
        }
        return returnNode;
    }
}
