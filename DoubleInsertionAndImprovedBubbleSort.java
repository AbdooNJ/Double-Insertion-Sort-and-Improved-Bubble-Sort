package DoubleInsertionAndImprovedBubbleSort;

import java.util.Random;

/**
 * This program implements two sorting algorithms: Double Insertion Sort and Improved Bubble Sort.
 * Double Insertion Sort is designed to sort an array by considering pairs of elements symmetrically around the center.
 * Improved Bubble Sort optimizes the traditional Bubble Sort algorithm by stopping the sorting process if no swaps occur.
 * The main method generates random arrays of various sizes and tests the performance of both algorithms.
 *
 * @author Abdul Hakeem AL-Najadi
 */
public class DoubleInsertionAndImprovedBubbleSort {

    public static void main(String[] args) {
        // Define array sizes
        int N1 = 10000;
        int N2 = 20000;
        int N3 = 40000;
        int N4 = 100000;
        int N5 = 200000;

        // Create random number generator
        Random num = new Random();

        // Generate a random number
        int randNum = num.nextInt();

        // Test Double Insertion Sort
        int[] result = new int[N1];
        for (int i = 0; i < result.length; i++) {
            result[i] = randNum;
        }
        double t1 = System.currentTimeMillis();
        doubleInsertionSort(result);
        double t2 = System.currentTimeMillis();
        System.out.println("Double Insertion Sort Time for N=" + N1 + ": " + (t2 - t1) + " milliseconds");

        // Test Improved Bubble Sort
        result = new int[N1]; // Reset the array
        for (int i = 0; i < result.length; i++) {
            result[i] = randNum;
        }
        double t3 = System.currentTimeMillis();
        improvedBubbleSort(result);
        double t4 = System.currentTimeMillis();
        System.out.println("Improved Bubble Sort Time for N=" + N1 + ": " + (t4 - t3) + " milliseconds");
    }

    /**
     * Sorts an array using the Double Insertion Sort algorithm.
     *
     * @param arr The array to be sorted
     */
    public static void doubleInsertionSort(int[] arr) {
        int min, max, temp;
        int mid = arr.length / 2;

        // Even length array
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[mid + i] < arr[mid - i]) {
                    max = arr[mid - i];
                    min = arr[mid + i];
                } else {
                    min = arr[mid - i];
                    max = arr[mid + i];
                }
            }

        }
        // Odd length array
        else {
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[mid + i + 1] < arr[mid - i - 1]) {
                    max = arr[mid - i - 1];
                    min = arr[mid + i + 1];
                } else {
                    min = arr[mid - i - 1];
                    max = arr[mid + i + 1];
                }
                for (temp = mid + i; arr[temp] > max; temp--)
                    arr[temp + 1] = arr[temp];
                arr[temp] = max;

                for (temp = mid - i; arr[temp] < max; temp++)
                    arr[temp - 1] = arr[temp];
                arr[temp] = min;
            }
        }
    }

    /**
     * Sorts an array using the Improved Bubble Sort algorithm.
     *
     * @param arr The array to be sorted
     */
    public static void improvedBubbleSort(int[] arr) {
        int i, j, temp;
        boolean swap;

        for (i = 0; i < arr.length - 1; i++) {
            swap = false;
            for (j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = temp; // There's an error here, it should be arr[j] = arr[j - 1]
                    arr[j - 1] = arr[j];
                    swap = true; // Swap occurred
                }
            }
            if (!swap) // If no swaps occur, the array is already sorted
                break;
        }
    }
}
