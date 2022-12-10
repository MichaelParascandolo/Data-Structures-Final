package Sorting;
import java.util.ArrayList;
import java.util.Random;

public class SortTester {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        ArrayList<Integer> nums3 = new ArrayList<>();
        ArrayList<Integer> nums4 = new ArrayList<>();
        ArrayList<Integer> nums5 = new ArrayList<>();

        Random ran = new Random();
        int x = 1000; // bound for random numbers
        int y = 10; // number of random numbers
        
        for(int i = 0; i <= y; i++) {
            nums1.add(ran.nextInt(x));
            nums2.add(ran.nextInt(x));
            nums3.add(ran.nextInt(x));
            nums4.add(ran.nextInt(x));
            nums5.add(ran.nextInt(x));
        }

        Sort sort = new Sort();
        sort.print(nums1, "\nBefore bubble sort");
        sort.bubbleSort(nums1);
        sort.print(nums1, "After bubble sort");

        // sort.print(nums2, "Before minHeap sort");
        // sort.sortHeap(nums2);
        // sort.print(nums2, "After minHeap sort");
        
        // sort.print(nums3, "Before selectionSort");
        // sort.selectionSort(nums3);
        // sort.print(nums3, "After selectionSort");

        // sort.print(nums4, "Before insertionSort");
        // sort.insertionSort(nums4);
        // sort.print(nums4, "After insertionSort");

        // sort.print(nums5, "Before mergeSort");
        // sort.mergeSort(nums5);
        // sort.print(nums5, "After mergeSort");

    }
}
