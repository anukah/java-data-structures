package End2021.Paper2.Q1;

public class Node {
    private int data;
    protected Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
