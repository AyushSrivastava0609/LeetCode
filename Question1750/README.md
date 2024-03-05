Intuition :-

To find the minimum length of the string after applying the given algorithm, we need to determine the longest common prefix and suffix in the string.
We then calculate the remaining length of the string after removing these common prefixes and suffixes.

Approach :-

1.Initialize two pointers, left pointing to the start of the string and right pointing to the end of the string.
2.Iterate through the string using the pointers while left is less than right and the characters at left and right positions are equal.
3.Inside the loop, find the common character (ch) and move the left pointer forward until the character changes, indicating the end of the common prefix.
4.Similarly, move the right pointer backward until the character changes, indicating the end of the common suffix.
5.Return the length of the remaining string, calculated as right - left + 1.
6.If left is greater than right, it means the entire string consists of the same character, so return 0.
7.If the length of the string is 1, return 1 as it is the minimum possible length.

This approach efficiently finds the minimum length of the string after applying the given algorithm.
