package End2022.Paper1.Q1;

public class Node {
    private Order order;
    protected Node next;

    public Node(String regNo, float time, String items, float total) {
        this.order = new Order(regNo, time, items, total);
        this.next = null;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
