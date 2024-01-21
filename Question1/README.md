Intuition :-

Basically, Here instead of using an extra loop, we will use the HashMap to check if the other element i.e. target-(selected element) exists. Thus we can trim down the time complexity of the problem.
And for the second variant, we will store the element along will its index in the HashMap. Thus we can easily retrieve the index of the other element i.e. target-(selected element) without iterating the array.

Approach :- 

Method Signature:
The method is named twoSum.
It takes two parameters:
nums: an array of integers.
target: the target sum that we are trying to achieve.

HashMap Initialization:
A HashMap named map is created to store elements from the array along with their indices.
The key is the array element, and the value is the index of that element.

Iterating through the Array:
The code uses a loop to iterate through each element in the nums array.

Calculating Complement:
For each element in the array, it calculates the complement by subtracting the current element (nums[i]) from the target sum.

Checking for Complement in HashMap:
It checks if the complement is already present in the HashMap.
If found, it means the current element (nums[i]) and its complement (complement) together form the target sum.
In such a case, it returns an array containing the indices of these two elements.

Updating HashMap:
After checking for the complement, the current element (nums[i]) and its index (i) are added to the HashMap.
This is done to keep track of the elements encountered so far.

Exception Handling:
If the loop completes without finding a valid pair, it throws an IllegalArgumentException.
This exception indicates that there is no solution to the two-sum problem with the given array and target sum.

Overall Explanation:
The algorithm uses a single pass through the array, storing elements and their indices in a HashMap.
For each element, it calculates the complement needed to reach the target sum.
If the complement is found in the HashMap, it returns the indices of the two elements that sum up to the target.
If the loop completes without finding a valid pair, it throws an exception indicating that there is no solution.
