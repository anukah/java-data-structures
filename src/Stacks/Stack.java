package Stacks;

public class Stack {
    Node top;

    public Stack() {
        this.top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data){
        Node node = new Node(data);
        if (top != null) {
            node.setNext(top);
        }
        top = node;
    }
    public void pop(){
        if(top == null){
            return;
        } else {
            top = top.getNext();
        }
    }
    public int peek(){
        return top.getData();
    }
    public void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }
    }
}
