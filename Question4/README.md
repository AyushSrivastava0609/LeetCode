Intuition :-

The given Java code defines a method named findMedianSortedArrays that takes two sorted arrays, nums1 and nums2, and calculates the median of the merged sorted array.
Let's break down the code and provide an explanation:

Explanation :-

Input:
The algorithm takes two sorted arrays, nums1 and nums2, as input.

Merging:
It creates a new array, arr, to hold the merged content of nums1 and nums2.
The elements of nums1 are copied into arr.
The elements of nums2 are then appended to the end of arr.

Sorting:
The merged array arr is sorted in ascending order.

Calculating the Median:
If the length of the merged array is odd, the median is the middle element.
If the length is even, the median is the average of the two middle elements.
The algorithm checks for the parity of the array length and calculates the median accordingly.
The result is returned as a double.

Final Explanation:
The algorithm efficiently merges and sorts the two arrays to find the median of the combined sorted array.
The approach leverages the fact that both input arrays are already sorted.
