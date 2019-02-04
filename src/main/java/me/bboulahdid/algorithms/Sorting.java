package me.bboulahdid.algorithms;


import java.util.Arrays;

public class Sorting {

    /**
     * At each step, we select the smallest element from the unsorted portion of the array and swap to the front.
     *
     * Time complexity: O(N^2)
     * Space complexity: O(1)
     *
     * @param array - an unsorted array of integers
     */
    public static void selectionSort(int[] array) {
        int arraySize = array.length;
        int smallestValueIndex, smallestValue, temp;

        for (int i = 0; i < arraySize; i++) {
            smallestValueIndex = i;
            smallestValue = array[i];

            // Get the smallest number & its index
            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < smallestValue) {
                    smallestValueIndex = j;
                    smallestValue = array[j];
                }
            }

            if (smallestValueIndex == i) {
                continue;
            }

            // swap
            temp = array[i];
            array[i] = array[smallestValueIndex];
            array[smallestValueIndex] = temp;
        }
    }

    /**
     * Continuously swap the largest element in the unsorted portion to the right until it is in its right position.
     * (the repeatedly swapping resembles the way bubbles rising to the surface)
     *
     * Time complexity: xxx
     * Space complexity: O(1)
     *
     * @param array - an unsorted array of integers
     */
    public static void bubbleSort(int[] array) {
        int arraySize = array.length;
        int temp;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < arraySize - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    /**
     *
     * ...
     *
     * Time complexity: xxx
     *
     * @param array - an unsorted array of integers
     * @return the sorted array
     */
    public static int[] mergeSort(int[] array) {
        int arraySize = array.length;

        if (arraySize == 1) {
            return array;
        }

        // Creating space for left & right arrays
        int midSize = arraySize / 2;
        int[] left = new int[midSize];
        int[] right = new int[arraySize - midSize];

        // Filling left & right arrays
        for (int i = 0; i < arraySize; i++) {
            if (i < midSize) {
                left[i] = array[i];
            } else {
                right[i - midSize] = array[i];
            }
        }

        // Recursively splitting & merging
        left = mergeSort(left);
        right = mergeSort(right);

        // Merging left & right arrays
        return merge(left, right);
    }

    /**
     * Sort two unsorted arrays and merge them
     *
     * @param left - an unsorted array of integers
     * @param right - an unsorted array of integers
     * @return the sorted array
     */
    private static int[] merge(int[] left, int[] right) {
        int leftArraySize = left.length;
        int rightArraySize = right.length;

        // Creating space for the merger array
        int[] result = new int[leftArraySize + rightArraySize];

        int i = 0;
        int j = 0;
        int index = 0;

        // Add until a sub-array is fully traversed
        while(i < leftArraySize && j < rightArraySize) {
            if (left[i] < right[j]) {
                result[index++] = left[i++];
            } else {
                result[index++] = right[j++];
            }
        }

        // Add leftovers from each sub-array (only one of these two while loops will be executed)
        while(i < leftArraySize) {
            result[index++] = left[i++];
        }

        while(j < rightArraySize) {
            result[index++] = right[j++];
        }

        return result;
    }
}
