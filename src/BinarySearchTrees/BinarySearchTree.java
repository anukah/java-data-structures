package BinarySearchTrees;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        this.root = null;
    }
    public void insertNode(int key){ root = insertHelper(root,key); }
    private Node insertHelper(Node root, int key){
        Node node = new Node(key);
        if (root == null){
            root = node;
            return root;
        }
        if (key < root.key){
            root.left = insertHelper(root.left, key);
        } else if (key > root.key){
            root.right = insertHelper(root.right, key);
        }
        return root;
    }
    public Node search(int data){
        if (searchHelper(root, data) == null) System.out.println("value does not exist!");
        return searchHelper(root,data);
    }
    private Node searchHelper(Node root, int data){
        if (root == null || root.key == data){ return root;}
        if (data<root.key){return searchHelper(root.left, data);}
        else {return searchHelper(root.right, data);}
    }
    public void searchLevel(int data) {
        System.out.println();
        System.out.println("The letter "+data+" is found on level " + searchLevelRecursive(root, data, 0));

    }
    private int searchLevelRecursive(Node root, int data, int level) {
        if (root == null) {
            return 0;
        }
        if (data == root.key) {
            return level;
        } else if (data < root.key) {
            return searchLevelRecursive(root.left, data, level + 1);
        } else {
            return searchLevelRecursive(root.right, data, level + 1);
        }
    }
    public void deleteNode(int key){ root = deleteHelper(root, key); }
    private Node deleteHelper(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.key) {
            root.left = deleteHelper(root.left, data);
        } else if (data > root.key) {
            root.right = deleteHelper(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteHelper(root.right, root.key);
        }
        return root;
    }

    private int minValue(Node root){
        int min = root.key;
        while(root.left!=null){
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    public void inorder(){inorderHelper(root);}
    public void inorderHelper(Node root){
        if (root!=null){
            inorderHelper(root.left);
            System.out.print(root.key + ",");
            inorderHelper(root.right);
        }
    }
    public void preorder(){preorderHelper(root);}
    public void preorderHelper(Node root){
        if (root!=null){
            System.out.print(root.key + ",");
            preorderHelper(root.left);
            preorderHelper(root.right);
        }
    }
    public void postorder(){postorderHelper(root);}
    public void postorderHelper(Node root){
        if (root!=null){
            postorderHelper(root.left);
            postorderHelper(root.right);
            System.out.print(root.key + ",");
        }
    }
    public void bfs(){
        if (root == null) return;
        Queue queue = new Queue();
        queue.enqueue(root);
        while(!queue.isEmpty()){
            Node node = queue.dequeue();
            System.out.print(node.key + ", ");
            if (node.left!=null){
                queue.enqueue(node.left);
            }
            if (node.right!=null){
                queue.enqueue(node.right);
            }
        }
        System.out.println();
    }
    public void dfs(){
        if (root == null) return;
        Stack stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.key + ", ");
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left!=null){
                stack.push(node.left);
            }
        }
        System.out.println();
    }

}
