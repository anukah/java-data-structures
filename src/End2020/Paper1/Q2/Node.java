package End2020.Paper1.Q2;

public class Node {
    private String ip_address;
    protected Node left;
    protected Node right;

    public Node(String ip_address) {
        this.ip_address = ip_address;
        this.left = null;
        this.right = null;
    }
    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
}
