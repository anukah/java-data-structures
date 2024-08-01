package End2022.Paper2.Q1;

public class Stack {
    Node top;
    public Stack(String URL) {
        this.top = new Node(URL);
    }
    public Stack() {
        this.top = null;
    }
    public void push(String URL){
        Node node = new Node(URL);
        if (top != null) {
            node.setNext(top);
        }
        top = node;
    }

    public Node pop(){
        Node ret = null;
        if (top!=null){
            ret = top;
            top = top.getNext();
        }
        return ret;
    }

    public Node peek(){
        return top;
    }

}
