package Queue_Array;
public class Queue {
    int[] queue;
    int front;
    int rear;
    int size;

    public Queue(int sizeOfArray) {
        this.queue = new int[sizeOfArray];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return (rear+1)% queue.length ==front;
    }

    public void enqueue(int data){
        if(isFull()){
            int[] newArray = new int[queue.length*2];
            for(int i=0;i<queue.length;i++){
                newArray[i]=queue[i];
            }
            queue= newArray;
        }
        rear = (rear +1)%queue.length;
        if(front==-1){
            front =rear;
        }
        queue[rear] =data;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }else if(front==rear) {
            int temp = queue[front];
            front=rear =-1;
            size--;
            return temp;
        }else {
            int temp = queue[front];
            front = (front+1) % queue.length;
            size--;
            return temp;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.print("Underflow");
            return;
        }
        int i =front;
        while (true){
            System.out.print(queue[i]+",");
            if(i==rear){
                break;
            }
            i=(i+1)%queue.length;
        }
        System.out.println();
    }

}
