Intuition:-

The objective is to identify a duplicate element within an array of integers. The approach involves utilizing a boolean array to keep track of visited elements and identifying duplicates during iteration.

Approach:-

Boolean Array Initialization:
   Initialize a boolean array named visited with a size of nums.length + 1.
   This array will serve to mark visited elements during traversal.
   
Iterating Through the Array:
   Employ a for loop to traverse each element in the nums array.
   
Checking for Duplicate:
   For each element nums[i], examine if the corresponding index in the visited array is marked as true.
   If visited[nums[i]] is true, the element nums[i] has been visited earlier, signifying it's a duplicate. Return nums[i].
   
Marking Visited Elements:
   If the current element nums[i] has not been visited yet, mark it as visited by setting visited[nums[i]] to true.
   
Return -1 if No Duplicate Found:
   If no duplicate is found after traversing the entire array, return -1 to indicate the absence of duplicates.




