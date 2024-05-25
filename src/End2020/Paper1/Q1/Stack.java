package End2020.Paper1.Q1;

public class Stack {
    Node top;
    public Stack() {
        this.top = null;
    }
    public boolean isEmpty(){return top==null;}
    public void push(int data){
        Node node = new Node(data);
        if (!isEmpty()) {
            node.next = top;
        }
        top = node;
    }
    public Node pop(){
        Node returnNode = null;
        if (!isEmpty()){
            returnNode = top;
            top = top.next;
        }
        return returnNode;
    }
    public void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.getData());
            temp = temp.next;
        }
    }
}
