Intuition:-

The goal of the customSortString method is to sort the characters in string s based on the custom order specified by the string order. 
Characters that appear in order are prioritized, while the remaining characters are appended in their original order.

Approach:-

Count Occurrences: Create a HashMap mp to count the occurrences of each character in string s.
Custom Sorting: Iterate through the characters in the order string. For each character c:
If mp contains c, append c to the result string result the number of times it appears in s, obtained from mp.get(c). Remove c from mp.
Append Remaining Characters: Iterate through the remaining characters in mp. For each character c, append c to result the number of times it appears in s.
Return Result: Return the result string.

This approach ensures that the characters in the result string are sorted according to the custom order specified by the order string,
with characters not present in order appended in their original order of occurrence in s.
