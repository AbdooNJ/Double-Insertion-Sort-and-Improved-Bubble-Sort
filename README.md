# Double-Insertion-Sort-and-Improved-Bubble-Sort
This Java program implements two sorting algorithms: Double Insertion Sort and Improved Bubble Sort

## Double Insertion Sort
- Double Insertion Sort is designed to sort an array by considering pairs of elements symmetrically around the center. 
- It operates differently depending on whether the array has an even or odd length.
- For an even-length array, it compares elements equidistant from the midpoint and swaps them if necessary.
- For an odd-length array, it compares elements at increasing distances from the midpoint and performs swaps accordingly.

## Improved Bubble Sort
- Improved Bubble Sort optimizes the traditional Bubble Sort algorithm by stopping the sorting process if no swaps occur during a pass, indicating that the array is already sorted. 
- This optimization reduces unnecessary iterations, enhancing the algorithm's efficiency.

## Main Method
- The main method generates random arrays of various sizes and tests the performance of both algorithms. 
- It measures the execution time for sorting arrays of sizes 10000 using both Double Insertion Sort and Improved Bubble Sort.
