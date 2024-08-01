package End2022.Paper2.Q2;

public class BST {
    Node root;
    public BST() {
        this.root = null;
    }
    public void insert(String word, int token){
        root = insertRec(root,word,token);
    }
    private Node insertRec(Node root,String word, int token){
        Node node = new Node(word, token);
        if (root == null) return node;
        else {
            if (node.getToken()< root.getToken()) root.left = insertRec(root.left, word, token);
            else root.right = insertRec(root.right, word, token);
        }
        return root;
    }

    public void postOrder(){
        postOrderRec(root);
    }

    private void postOrderRec(Node root){
        if (root!=null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.getWord() + " ");
        }
    }

    public void delete(String word){
        root = deleteRec(root, search(word));
    }


    private Node deleteRec(Node root, int token){
        if (root == null)  return null;
        if (token < root.getToken()){
            root.left = deleteRec(root.left, token);
        } else if (token > root.getToken()){
            root.right = deleteRec(root.right, token);
        } else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }
            root.setWord(minValue(root.right).getWord());
            root.setToken(minValue(root.right).getToken());
            root.right = deleteRec(root.right, root.getToken());
        }
        return root;
    }

    private Node minValue(Node root){
        Node node = root;
        while (root.left!=null){
            node = root.left;
            root = root.left;
        }
        return node;
    }

    private int search(String word){
        return searchRec(root,word).getToken();
    }

    private Node searchRec(Node root, String word){
        if (root == null) return null;
        else if (root!=null && root.getWord() == word) {
            return root;
        } else {
            Node ret = searchRec(root.left, word);
            if (ret == null) ret = searchRec(root.right, word);
            return ret;
        }
    }

    public void dfs(String word){
        if (root == null) return;
        Stack stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            if (node.getWord().equals(word)){
                return;
            } else {
                System.out.print(node.getWord() + ", ");
                if (node.left!=null){
                    stack.push(node.left);
                }
                if (node.right!=null){
                    stack.push(node.right);
                }
            }
        }
        System.out.println();
    }
    public void bfs(String word){
        if (root == null) return;
        Queue queue = new Queue();
        queue.enqueue(root);
        while(!queue.isEmpty()){
            Node node = queue.dequeue();
            if (node.getWord().equals(word)){
                return;
            } else {
                System.out.print(node.getWord() + ", ");
                if (node.left!=null){
                    queue.enqueue(node.left);
                }
                if (node.right!=null){
                    queue.enqueue(node.right);
                }
            }
        }
        System.out.println();
    }


}
