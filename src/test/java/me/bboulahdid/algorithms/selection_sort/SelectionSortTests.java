package me.bboulahdid.algorithms.selection_sort;

import me.bboulahdid.algorithms.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

@DisplayName("Selection sort tests")
class SelectionSortTests {

    public static int[] getUnsortedNumbers() {
        return new int[] {0, 6, 56, 3, 2, 170, 6};
    }

    public static int[] getSortedNumbers() {
        return new int[] {0, 2, 3, 6, 6, 56, 170};
    }

    public static int[] getRandomIntegers(int arraySize, int minValue, int maxValue) {
        return new Random().ints(minValue, maxValue).limit(arraySize).toArray();
    }

    @Test
    @DisplayName("Should return an empty array when given an empty array")
    void shouldReturnAnEmptyArrayWhenGivenAnEmptyArray() {
        int[] numbers = new int[0];
        Sorting.selectionSort(numbers);

        Assertions.assertArrayEquals(numbers, new int[0]);
    }

    @Test
    @DisplayName("Should return a sorted array when given an unsorted array")
    void shouldReturnASortedArrayWhenGivenAnUnsortedArray() {
        int[] numbers = getUnsortedNumbers();
        Sorting.selectionSort(numbers);

        Assertions.assertArrayEquals(numbers, getSortedNumbers());
    }

    @Test
    @DisplayName("Should sort an array of random integers")
    void shouldSortAnArrayOfRandomIntegers() {
        int[] numbers = getRandomIntegers(10, 0, 100);

        // Create a deep copy of `numbers` array (works only for primitives)
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);

        Sorting.selectionSort(numbers);

        Assertions.assertArrayEquals(numbers, sortedNumbers);
    }
}
