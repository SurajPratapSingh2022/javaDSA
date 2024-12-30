package com.dsa.main;
//integer quick sort middle array
public class QuickSortMiddleInteger {
    int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
    public static void main(String[] args) {
        QuickSortMiddleInteger qsm = new QuickSortMiddleInteger();
        qsm.quickSortRecursion(qsm.arr, 0, qsm.arr.length - 1);
        qsm.printArray(qsm.arr);
    }
    int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2]; // Choose the middle element as pivot
//        int pivot = arr[low]; // Choose the lower element as pivot
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                // Swap elements
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
    void quickSortRecursion(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            // Recursively sort elements before and after partition
            quickSortRecursion(arr, low, pi - 1);
            quickSortRecursion(arr, pi, high);
        }
    }
    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}