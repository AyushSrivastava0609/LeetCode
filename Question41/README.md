Intuition:-

The goal of this algorithm is to find the smallest positive integer missing from an array of integers.

Approach:-

Initialize a boolean array found of size n+1, where n is the length of the input array nums. This array is used to mark the presence of positive integers.
Iterate through the elements of the nums array:
       For each positive integer num in the range [1, n], mark its presence in the found array by setting found[num] = true.
Iterate through the numbers from 1 to n:
       If a positive integer i is not found in the found array, return i as it is the smallest missing positive integer.
If all positive integers from 1 to n are found in the found array, return n+1, as the next positive integer in the sequence would be n+1.

This approach utilizes the boolean array found to efficiently mark the presence of positive integers from 1 to n in the input array nums,
and then finds the smallest missing positive integer by iterating through the numbers from 1 to n.
