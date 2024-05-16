package BinarySearchTrees;

import sun.font.CreatedFontTracker;

public class Stack {
    StackNode top;
    public Stack() {
        this.top = null;
    }
    public boolean isEmpty(){return top == null;}
    public void push(Node root){
        StackNode node = new StackNode(root);
        if (!isEmpty()) {
            node.next = top;
        }
        top = node;
    }
    public Node pop(){
        Node returnNode = null;
        if (!isEmpty()){
        returnNode = top.root;
        top = top.next;
        }
        return returnNode;
    }

}
