package End2022.Paper2.Q1;

public class Node {
    private String URL;

    protected Node next;

    public Node(String URL) {
        this.URL = URL;
        this.next = null;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
