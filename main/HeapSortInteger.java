package com.dsa.main;
//Integer heap sort array
public class HeapSortInteger {
    public static void main(String[] args) {
        int[] arr = {22, 13, 17, 11, 10, 14, 12};
        HeapSortInteger hs = new HeapSortInteger();
        hs.sort(arr);
        hs.printArray(arr);
    }
    // Sort function to perform Heap Sort
    void sort(int[] arr) {
        int length = arr.length;
        // Build max heap
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }
        // Extract elements from heap one by one
        for (int i = length - 1; i >= 0; i--) {
            // Swap current root with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }
    // Heapify function to maintain the max heap property
    void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child
        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    // Print the array
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}