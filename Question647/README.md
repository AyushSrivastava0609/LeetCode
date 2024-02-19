The countSubstrings method counts the number of palindromic substrings in a given string s. 
It iterates through each character of the string and expands outward to count both even and odd-length palindromes centered at the current character.
The helper method palindromeCount is used to count the number of palindromes with a given center. 
The count is accumulated for each center, and the total count of palindromic substrings is returned as the final answer.
