package End2020.Paper1.Q2;

public class Node {
    private String address;
    protected Node left;
    protected Node right;

    public Node(String address) {
        this.address = address;
        this.left = null;
        this.right = null;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
