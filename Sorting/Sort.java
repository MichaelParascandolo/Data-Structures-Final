package Sorting;
import java.util.ArrayList;

public class Sort {
    private long startTime; // start clock
    private long endTime; // end clock
    private long totalTime; // total runtime

    // Bubble sort
    public void bubbleSort(ArrayList<Integer> nums) {
        startTime = System.nanoTime();
        for(int i = 0; i < nums.size(); i++) {
           for(int j = 0; j < nums.size(); j++ ){
                if(nums.get(i) < nums.get(j)) {
                    int holder = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, holder);
                }
           }
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
    }
    // minHeap sort
    public void sortHeap(ArrayList<Integer> array) {
        startTime = System.nanoTime();
        for (int i = array.size() / 2 - 1; i >= 0; i--) {
            heapify(array, array.size(), i);
        }
        for (int j = array.size() - 1; j > 0; j--) {
            int holder = array.get(0);
            array.set(0,array.get(j));
            array.set(j,holder);
            heapify(array, j, 0);
        }
    }
    public void heapify(ArrayList<Integer> array, int length, int i) {
         int start = i;
         int left = 2 * i + 1;
         int right = 2 * i + 2;
            if (left < length && array.get(left) > array.get(start)) {
                start = left;
            }
            if (right < length && array.get(right) > array.get(start)) {
                start = right;
            }
        if (start != i) {
            int holder = array.get(i);
            array.set(i,array.get(start));
            array.set(start,holder);
            heapify(array, length, start);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
    }
    // selection sort
    public void selectionSort(ArrayList<Integer> array) {
        startTime = System.nanoTime();
        for(int i = 0; i < array.size(); i++) {
            int index = i;
            for(int j = i + 1; j < array.size(); j++) {
                if(array.get(j) < array.get(index)) {
                    index = j;
                }
            }
            int smallest = array.get(index);
            array.set(index, array.get(i));
            array.set(i, smallest);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
    } 
    // insertion sort
    public void insertionSort(ArrayList<Integer> array) {
        startTime = System.nanoTime();
        int length = array.size();
        int key;
        for(int i = 1; i < length; i++) {
            key = array.get(i);
            int j = i -1;
            while(j >= 0 && array.get(j) > key) {
                array.set(j+1,array.get(j));
                j = j -1;
            }
            array.set(j+1,key);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
    }
    //merge sort
    public ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
        startTime = System.nanoTime();
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int center;
     
        if (array.size() == 1) {    
            return array;
        } else {
            center = array.size()/2;
            for (int i=0; i<center; i++) {
                    left.add(array.get(i));
            }
     
            for (int i=center; i<array.size(); i++) {
                    right.add(array.get(i));
            }
     
            left  = mergeSort(left);
            right = mergeSort(right);
     
            merge(left, right, array);
        }
        return array;
    }
    private void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;
     
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }
        ArrayList<Integer> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }
        for (int i=restIndex; i<rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
    }


    //prints the array
    public void print(ArrayList<Integer> nums, String text) {
        System.out.print(text + "\n");
        for(int i = 0; i < nums.size(); i++) {
            // System.out.println(i + " - " + nums.get(i));
            System.out.println(nums.get(i));
        }
        if(totalTime > 0 ) {
            System.out.println("Total Time: " + totalTime + " ");
            // reset the timer
            startTime = 0;
            endTime = 0;
            totalTime = 0;
        }
    }

 
}
