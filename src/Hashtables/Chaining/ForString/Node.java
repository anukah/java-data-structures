package Hashtables.Chaining.ForString;

public class Node {
    private String data;
    private int key;
    protected Node next;
    public Node(String data, int key) {
        this.data = data;
        this.key = key;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
