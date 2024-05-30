package End2020.Paper2.Q2;

public class Node {
    private String tagName;
    private String className;
    private String id;
    private String[] content;
    protected Node left;
    protected Node right;

    public Node(String tag){
        this.tagName = HelperClass.getTag(tag);
        this.className = HelperClass.getClassName(tag);
        this.id = HelperClass.getId(tag);
        this.content = HelperClass.getVar(tag);
        this.left = null;
        this.right = null;
    }

    public String getTagName() { return tagName; }

    public void setTagName(String tagName) { this.tagName = tagName; }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }
}
