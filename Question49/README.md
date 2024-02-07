Intuition :-

The problem requires grouping anagrams together. Anagrams are words or phrases formed by rearranging the letters of another word or phrase.
For example, "listen" and "silent" are anagrams of each other. To group anagrams together, we need to find a way to identify which words belong to the same anagram group.

Approach :-

Using a HashMap: We use a HashMap to group anagrams. 
The key of the HashMap will be a canonical representation of each group of anagrams, and the value will be a list of words that belong to that group.

Canonical Representation: To determine if two words are anagrams of each other, we need to compare their sorted forms.
If two words are anagrams, sorting them will result in the same sequence of characters. For example, "listen" and "silent" both sort to "eilnst". 
So, we sort each word in the input array of strings and use the sorted form as the key in the HashMap.

Iterating Through the Input Array: We iterate through each word in the input array of strings. For each word:

1.We convert it into a character array.
2.We sort the character array to get its canonical representation.
3.We check if the canonical representation exists as a key in the HashMap. If not, we create a new entry with the canonical representation as the key and an empty list as the value.
4.We add the original word to the list corresponding to its canonical representation key in the HashMap.
5.Constructing the Result: After processing all words in the input array, our HashMap will contain groups of anagrams. We iterate through the values of the HashMap (each list of words belonging to the same anagram group) and add them to the result list.

Returning the Result: Finally, we return the result list containing lists of words grouped by anagrams.

This approach efficiently groups anagrams together by leveraging the properties of anagrams and using a HashMap for efficient lookup and storage.
It has a time complexity of O(n * k log k), where n is the number of words in the input array and k is the maximum length of a word. 
Sorting each word takes O(k log k) time, and we do this for each of the n words.
