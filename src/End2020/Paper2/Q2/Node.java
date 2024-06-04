package End2020.Paper2.Q2;

public class Node {
    private String tagName;
    private String id;
    private String className;
    private String content;
    protected Node left;
    protected Node right;
    protected boolean closed;
    public Node(String string) {
        this.tagName = HelperClass.getTag(string);
        this.id = HelperClass.getId(string);
        this.className = HelperClass.getClassName(string);
        this.content = null;
        this.left = null;
        this.right = null;
        this.closed = false;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

