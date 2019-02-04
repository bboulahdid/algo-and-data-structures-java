package me.bboulahdid.algorithms;

public class Searching {

    /**
     * Traverse through the entire array to search for an element.
     *
     * Complexity: O(N)
     *
     * @param array - an unsorted array of integers
     * @param value - the integer we're looking for
     * @return the index of the integer we're looking for or -1 otherwise
     */
    public static int linearSearch(int[] array, int value) {
        int arraySize = array.length;
        int index = -1;

        for (int i = 0; i < arraySize; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }

        return index;
    }
}
