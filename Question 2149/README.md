Intuition:-

The rearrangeArray function aims to rearrange the elements of the given array nums such that positive integers are followed by negative integers alternately.

Approach:-

Partitioning:
Initialize two queues, pos and neg, to store positive and negative integers respectively.

Separate Positive and Negative Integers:
Iterate through each element in the nums array.
If the current element is non-negative, enqueue it into the pos queue.
If the current element is negative, enqueue it into the neg queue.

Interleave Positive and Negative Integers:
Initialize an ArrayList res to store the rearranged elements.

While both pos and neg queues are not empty:
Dequeue one element from the pos queue and add it to the res list.
Dequeue one element from the neg queue and add it to the res list.
This step ensures that positive and negative integers are interleaved alternately in the res list.

Convert ArrayList to Array:
Initialize an array ans of the same length as the input nums.
Iterate through the elements of the res list and copy them to the ans array.

Return Result:
Return the rearranged array ans as the output of the function.

Note: This approach efficiently rearranges the elements of the input array by partitioning positive and negative integers into separate queues and then interleaving them
alternately to form the final rearranged array. The use of queues ensures that the positive and negative integers are processed in the order of their appearance in the input array.
