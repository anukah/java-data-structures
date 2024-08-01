package End2022.Paper2.Q2;

public class Queue {
    SearchNode front;
    SearchNode rear;
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){return front == null;}

    public void enqueue(Node root){
        SearchNode node = new SearchNode(root);
        if (isEmpty()){
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }
    public Node dequeue(){
        Node ret = null;
        if (!isEmpty()){
            ret = front.root;
            front = front.next;
        }
        return ret;
    }

}
