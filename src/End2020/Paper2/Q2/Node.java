package End2020.Paper2.Q2;

class Node {
    private String tagName;
    private String className;
    private String id;
    private String content;
    protected Node left;
    protected Node right;

    public Node(String tag) {
        this.tagName = HelperClass.getTag(tag);
        this.className = HelperClass.getClassName(tag);
        this.id = HelperClass.getId(tag);
        this.content = getContentFromTag(tag);
        this.left = null;
        this.right = null;
    }

    private String getContentFromTag(String tag) {
        // Split the tag by commas and return the content part
        String[] parts = tag.split(",");
        if (parts.length > 1) {
            StringBuilder contentBuilder = new StringBuilder();
            for (int i = 1; i < parts.length; i++) {
                contentBuilder.append(parts[i]).append(" ");
            }
            return contentBuilder.toString().trim();
        }
        return "";
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}