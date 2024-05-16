package BinarySearchTrees;

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
    public void enqueue(Node root){
        QueueNode node = new QueueNode(root);
        if (isEmpty()){
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }
    public Node dequeue(){
        Node returnNode = null;
        if (!isEmpty()){
            returnNode = front.root;
            front = front.next;
        }
        return returnNode;
    }
}
