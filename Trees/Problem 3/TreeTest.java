public class TreeTest {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.addLeft(5);
        root.getLeft().addLeft(2);
        root.getLeft().getLeft().addLeft(43);
        root.getLeft().getLeft().addRight(3);
        root.addRight(7);
        root.getRight().addRight(19);
        root.getRight().addLeft(59);

        TreeIterator iterator = new TreeIterator(root);
            System.out.print("\n" + iterator.next().getData() + " ");
            System.out.print(iterator.next().getData() + " ");
            System.out.print(iterator.next().getData() + " ");
            System.out.print(iterator.next().getData() + " ");
            System.out.print(iterator.next().getData() + " ");
            System.out.print(iterator.next().getData() + " ");
            System.out.print(iterator.next().getData() + " ");
            System.out.print(iterator.next().getData() + " ");

            // removing 7 from the tree
            // iterator.remove(root.getRight());
       
    }
}
