Intuition:-

The goal of the getCommon method is to find a common element between two sorted integer arrays nums1 and nums2.

Approach:-

Initialize two pointers i and j to iterate through the arrays nums1 and nums2, respectively.
Use a while loop to iterate until either array ends (i reaches the end of nums1 or j reaches the end of nums2).
At each step, compare the elements at indices i and j of nums1 and nums2 respectively:
     If nums1[i] is equal to nums2[j], it means we have found a common element, so return nums1[i].
     If nums1[i] is less than nums2[j], increment i to move to the next element in nums1.
     If nums1[i] is greater than nums2[j], increment j to move to the next element in nums2.
If no common element is found during the iteration, return -1 to indicate that there is no common element between the two arrays.
