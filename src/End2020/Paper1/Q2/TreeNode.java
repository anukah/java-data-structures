package End2020.Paper1.Q2;

public class TreeNode {
    private String ipAddress;
    protected TreeNode left;
    protected TreeNode right;

    public TreeNode(String ipAddress) {
        this.ipAddress = ipAddress;
        this.left = null;
        this.right = null;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
