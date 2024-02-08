Intuition:-

The problem requires finding the length of the longest substring without repeating characters in a given string. 
This means we need to traverse the string and keep track of the characters we've encountered so far while ensuring that we don't repeat any character.

Approach:-

Sliding Window Technique: We can use the sliding window technique to efficiently solve this problem.
The sliding window approach involves maintaining a window (a substring) and sliding it along the string while keeping track of certain properties of the substring.

HashMap for Character Index: We use a HashMap to store the characters encountered so far along with their indices.
This HashMap helps us keep track of the last occurrence index of each character.

Two Pointers: We use two pointers, i and j, to represent the start and end of the current substring being considered.
The variable i represents the start of the substring, and j represents the end.

Traversing the String: We iterate through the string using the j pointer. At each step:

We check if the current character (s.charAt(j)) is already present in the HashMap. If it is, it means we've encountered this character before.
In this case, we update the start pointer (i) to be the maximum of its current value and the index of the last occurrence of the character (map.get(current) + 1). 
This ensures that i moves to the position after the last occurrence of the character, thus excluding the repeated character from the current substring.
We update the index of the current character in the HashMap to the current index (j).
We update the maximum length of the substring (maxLength) by taking the maximum of its current value and the length of the current substring (j - i + 1).
Returning the Result: After traversing the entire string, the maxLength variable will contain the length of the longest substring without repeating characters.

This approach efficiently finds the length of the longest substring without repeating characters by using the sliding window technique and maintaining a HashMap to keep track of character indices.
It has a time complexity of O(n), where n is the length of the input string s. This is because we only traverse the string once.
