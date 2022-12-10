package Trees.Problem2;
import java.util.Arrays;

public class HeapTester {
    public static void main(String args[]) {
        int[] array = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};

        System.out.println("\nBefore Sort:");
        System.out.println(Arrays.toString(array)+"\n");

        HeapSort heap = new HeapSort();
        heap.sortHeap(array,true);
        System.out.println("After MinHeap Sort:");
        System.out.println(Arrays.toString(array) + "\n");
        
        heap.sortHeap(array,false);
        System.out.println("After MaxHeap Sort:");
        System.out.println(Arrays.toString(array) + "\n");
        
    }
}
