
public class Node {
    private int data;
    private Node left;
    private Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public int getData() {
        return this.data;
    }
    public Node getRight() {
        return this.right;
    }
    public Node getLeft() {
        return this.left;
    }
    public boolean hasRight() {
        if(this.right != null) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean hasLeft() {
        if(this.right != null) {
            return true;
        }
        else {
            return false;
        }
    }
    public void addRight(int right) {
        this.right = new Node(right);
    } 
    public void addLeft(int left) {
        this.left = new Node(left);
    }
}
