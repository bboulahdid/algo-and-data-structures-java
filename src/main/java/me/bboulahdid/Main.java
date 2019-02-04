package me.bboulahdid;

import me.bboulahdid.algorithms.Searching;
import me.bboulahdid.algorithms.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 67, 5}; // , 0, 100, 1, 4, 77

        // System.out.println("Searching...");

        // int n = 4;
        // System.out.println("Looking for value " + n + "...");
        // int index = Searching.linearSearch(numbers, n);
        // System.out.println(index != -1 ? "Found in index " + index : "Not found :(");

        // System.out.println("Sorting...");

        // Sorting.selectionSort(numbers);

        // Sorting.bubbleSort(numbers);

        System.out.println(Arrays.toString(Sorting.mergeSort(numbers)));
    }
}
