public class HeapSort {
    private int start; // biggest or smallest number
    private int left;
    private int right;
    private int i;
    private int j;

    // Build the heap
    public void sortHeap(int array[], Boolean min) {
        for (i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i, min);
        }
        for (j = array.length - 1; j > 0; j--) {
            // Move current root to end
            int holder = array[0];
            array[0] = array[j];
            array[j] = holder;
            // call max heapify on the reduced heap
            heapify(array, j, 0, min);
        }
    }
    // To heapify a subtree
    public void heapify(int array[], int length, int i, Boolean min) {
        // start with root as start
         start = i;
         left = 2 * i + 1;
         right = 2 * i + 2;
         // if MinHeap
        if(min) {
            if (left < length && array[left] > array[start]) {
                start = left;
            }
            if (right < length && array[right] > array[start]) {
                start = right;
            }
        }
        // if MaxHeap
        else {
            if (left < length && array[left] < array[start]) {
                start = left;
            }
            if (right < length && array[right] < array[start]) {
                start = right;
            }
        }
        // If start is not root
        if (start != i) {
            int holder = array[i];
            array[i] = array[start];
            array[start] = holder;
            // Recursively heapify the sub-tree
            heapify(array, length, start, min);
        }
    }
}
