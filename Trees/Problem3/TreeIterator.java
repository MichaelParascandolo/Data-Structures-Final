package Trees.Problem3;
import java.util.NoSuchElementException;
import java.util.Stack;

public class TreeIterator {

    private Stack<Node> stack;
    private Node current;

    public TreeIterator(Node root) {
        stack = new Stack<Node>();
        moveLeft(root);
    }
    public void moveLeft(Node current) {
        while(current != null) {
            stack.push(current);
            current = current.getLeft();
        }
    }
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    public Node next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        current = stack.pop();
        
        if(current.hasRight()) {
            moveLeft(current.getRight());
        }
        return current;
    }
}
