Intuition:-

The goal of this solution is to find the number of elements in the given array that have the maximum frequency.

Approach:-

Initialize a HashMap<Integer, Integer> named frequencyMap to store the frequency of each element in the array.

Iterate through the nums array:
For each element num, update its frequency in the frequencyMap using frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1).
Update the maxFrequency variable to keep track of the maximum frequency encountered so far.
Initialize a variable count to 0 to keep track of the count of elements with maximum frequency.

Iterate through the nums array again:
For each element num, if its frequency in the frequencyMap equals maxFrequency, increment the count.
Finally, return the count, which represents the number of elements with the maximum frequency in the array.

This approach efficiently calculates the frequency of each element and identifies elements with the maximum frequency, providing the desired result.
