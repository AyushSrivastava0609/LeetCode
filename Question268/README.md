Intuition:-
The missingNumber method aims to find the missing number in an array of integers nums.

Approach:-
Calculate the sum of the first n natural numbers using the formula (n * (n + 1)) / 2, where n is the length of the input array nums.
Iterate through the elements of nums and calculate the sum of all the elements.
Subtract the actual sum of the elements from the expected sum of the first n natural numbers.
Return the difference, which represents the missing number in the array.
