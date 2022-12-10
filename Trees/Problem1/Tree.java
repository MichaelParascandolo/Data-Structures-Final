package Trees.Problem1;
public class Tree {
    private int data;
    private Tree left;
    private Tree right;

    Tree(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return this.data;
    }
    public Tree getRight() {
        return this.right;
    }
    public Tree getLeft() {
        return this.left;
    }
    public void addRight(int right) {
        this.right = new Tree(right);
    } 
    public void addLeft(int left) {
        this.left = new Tree(left);
    }
}
