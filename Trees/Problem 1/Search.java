import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Search {
    private Queue<Tree> queue = new LinkedList<Tree>();
    private Stack<Integer> stack = new Stack<Integer>();
    
    // BFS - Used to print out all the values of a Binary Tree.
    public void bfs(Tree bt) {
        queue.add(bt);
        while(!queue.isEmpty()) {
            Tree node = queue.poll();
            System.out.println(node.getData());

            if(node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if(node.getRight() != null) {
                queue.add(node.getRight());
            }
       }
    }
    // DFS - Used to print out all the values of a Binary Tree.
    public void dfs(Tree bt) {    
        if(bt != null) {
            System.out.println(bt.getData());
            dfs(bt.getLeft());
            dfs(bt.getRight());
        }
    }
    // BFS - Used to determine if a value is contained within a Binary Tree.
    public boolean bfsSearch(Tree bt, int searchTarget) {
        queue.add(bt);
        while(!queue.isEmpty()) {
            Tree node = queue.poll();
            if(node.getData() == searchTarget) {
                return true;
            }
            if(node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if(node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        return false;
}
    // DFS - Used to determine if a value is contained within a Binary Tree.
    public boolean dfsSearch(Tree bt, int searchTarget) {
            if(bt != null) {
                stack.push(bt.getData());
                dfsSearch(bt.getLeft(),searchTarget);
                dfsSearch(bt.getRight(),searchTarget);
            }
            if(stack.search(searchTarget) != -1 ) {
                return true;
            }
            return false;
       
    }
    public void found(Boolean found) {
        if(found) {
            System.out.println(" Data Found!");
        }
        else {
            System.out.println("Data Not Found!\n");
        }
    }
}
