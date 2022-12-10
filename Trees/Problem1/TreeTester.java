package Trees.Problem1;
public class TreeTester {
   public static void main(String[] args) {
       // constructs the tree
    Tree tree1 = new Tree(10);
    Tree tree2 = new Tree(0);
    Tree tree3 = new Tree(18);
    Tree tree4 = new Tree(89);

    // tree1
    tree1.addLeft(5);
    tree1.getLeft().addLeft(2);
    tree1.getLeft().getLeft().addLeft(43);
    tree1.getLeft().getLeft().addRight(3);
    
    tree1.addRight(7);
    tree1.getRight().addLeft(59);

    // tree2
    tree2.addLeft(55);
    tree2.getLeft().addLeft(287);
    tree2.getLeft().getLeft().addLeft(143);
    tree2.getLeft().getLeft().addRight(3);
    
    tree2.addRight(79);
    tree2.getRight().addLeft(59);


    // tree3
    tree3.addLeft(500);
    tree3.getLeft().addLeft(212);
    tree3.getLeft().getLeft().addLeft(343);
    tree3.getLeft().getLeft().addRight(33);
    
    tree3.addRight(67);
    tree3.getRight().addLeft(9);


    // tree4
    tree4.addLeft(0);
    tree4.getLeft().addLeft(632);
    tree4.getLeft().getLeft().addLeft(443);
    tree4.getLeft().getLeft().addRight(3414);
    
    tree4.addRight(7);
    tree4.getRight().addLeft(159);


    Search search1 = new Search();
    Search search2 = new Search();
    Search search3 = new Search();
    Search search4 = new Search();

    // TREE 1
    // BFS ********************************************
    System.out.print("BFS PRINT: \n");
    // bfs print
    search1.bfs(tree1);
    // bfs search1 for 0 NOT FOUND
    System.out.print("BFS SEARCH: ");
    search1.found(search1.bfsSearch(tree1,5));

    // DFS ********************************************
    System.out.print("DFS PRINT: \n");
    search1.dfs(tree1);
    System.out.print("DFS PRINT: ");
    search1.found(search1.dfsSearch(tree1,143));

    // TREE 2
    // BFS ********************************************
    System.out.print("BFS PRINT: \n");
    search2.bfs(tree2);
    System.out.print("BFS SEARCH: ");
    search2.found(search2.bfsSearch(tree2,5));

    // DFS ********************************************
    System.out.print("DFS PRINT: \n");
    search2.dfs(tree2);
    System.out.print("DFS PRINT: ");
    search2.found(search2.dfsSearch(tree2,59));

    // TREE 3
    // BFS ********************************************
    System.out.print("BFS PRINT: \n");
    search3.bfs(tree3);
    System.out.print("BFS SEARCH: ");
    search3.found(search3.bfsSearch(tree3,143));

    // DFS ********************************************
    System.out.print("DFS PRINT: \n");
    search3.dfs(tree3);
    System.out.print("DFS PRINT: ");
    search3.found(search3.dfsSearch(tree3,212));

    // TREE 4
    // BFS ********************************************
    System.out.print("BFS PRINT: \n");
    search4.bfs(tree4);
    System.out.print("BFS SEARCH: ");
    search4.found(search4.bfsSearch(tree4,52));

    // DFS ********************************************
    System.out.print("DFS PRINT: \n");
    search4.dfs(tree4);
    System.out.print("DFS PRINT: ");
    search4.found(search4.dfsSearch(tree4,159));


   }
}
