package PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue.Queue queue = new PriorityQueue.Queue();
        queue.enqueue(1,2);
        queue.enqueue(2,5);
        queue.display();
        queue.dequeue();
        System.out.println();
        queue.display();
    }
}
