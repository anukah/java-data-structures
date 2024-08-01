package End2022.Paper2.Q2;

public class Stack {
    SearchNode top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty(){return top == null;}

    public void push(Node root){
        SearchNode node = new SearchNode(root);
        if (!isEmpty()) {
            node.next = top;
        }
        top = node;
    }
    public Node pop(){
        Node ret = null;
        if (!isEmpty()){
            ret = top.root;
            top = top.next;
        }
        return ret;
    }
}
