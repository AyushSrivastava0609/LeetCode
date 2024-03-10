Intuition:-

The goal of the intersection method is to find the intersection of two integer arrays nums1 and nums2, i.e., the elements that are common in both arrays.

Approach:-

Create two HashSet objects: num to store the elements of nums1, and res to store the intersection of nums1 and nums2.
Iterate through nums1 and add each element to the num HashSet to remove duplicates.
Iterate through nums2 and check if each element exists in the num HashSet. If it does, add it to the res HashSet.
Convert the res HashSet to an integer array finalres.
Return finalres as the result.

This approach ensures that the intersection is found efficiently by leveraging the constant-time lookup property of HashSet for membership testing.
The final result is returned as an integer array containing the elements common to both input arrays.
