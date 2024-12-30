package com.dsa.main;
//integer merge sort array
public class MergeSortInteger {
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args) {
        int[] inputArr = {48, 36, 13, 52, 19, 94, 21};
        MergeSortInteger ms = new MergeSortInteger();
        ms.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }
    public void sort(int[] inputArr) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length - 1);
    }
    public void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Sort the left side of the array
            divideArray(lowerIndex, middle);
            // Sort the right side of the array
            divideArray(middle + 1, higherIndex);
            // Merge the sorted halves
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }
    public void mergeArray(int lowerIndex, int middle, int higherIndex) {
        // Copy the elements into the temporary array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        // Merge the arrays
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from the left side, if any
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            i++;
            k++;
        }
    }
}