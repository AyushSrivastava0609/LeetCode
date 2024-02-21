Intuition:-

The function rangeBitwiseAnd aims to find the bitwise AND of all integers in the range [left, right].

Approach:-

Initialize a variable sum to track the number of times we right shift both left and right until they become equal.
Right shift left and right simultaneously until they are equal.
Once left and right are equal, return the bitwise AND of left shifted left by sum positions. This will give the common prefix of all integers in the range [left, right].
Note: As we are right shifting both left and right, their common prefix will remain the same. Hence, we can simply left shift the common prefix to obtain the result.
