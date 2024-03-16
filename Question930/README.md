Intuition:
The goal of this problem is to find the number of contiguous subarrays within the given array nums whose sum equals the given goal. 
To solve this problem efficiently, we can utilize the concept of sliding window combined with prefix sum technique.

Approach:

Define a helper function atmostK to find the number of subarrays with at most goal sum.
Initialize two pointers i and j at the start of the array and set the initial sum and answer to 0.
Iterate through the array with pointer i:
     Add the current element nums[i] to the sum.
     While the sum is greater than the goal, move the pointer j forward and subtract nums[j] from the sum until the sum is less than or equal to goal.
     Update the answer by adding the count of subarrays from j to i.
Repeat steps 3 until the end of the array.
Return the difference between the number of subarrays with at most goal sum and the number of subarrays with at most goal-1 sum, 
which gives the count of subarrays with exact goal sum.

This approach ensures linear time complexity since we traverse the array only once.
