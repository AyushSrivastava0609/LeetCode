Intuition:-

The goal of this problem is to insert a new interval into a list of non-overlapping intervals, merging any overlapping intervals if necessary. 
To achieve this, we can iterate through the list of intervals and perform merging operations when necessary.

Approach:-

Initialize an index i to traverse the list of intervals and create an empty list result to store the merged intervals.
Iterate through the list of intervals:
       If the end of the current interval is less than the start of the new interval, add the current interval to the result list.
       If the start of the current interval is greater than the end of the new interval, it means we have reached the position where the new interval should be inserted without overlap. Break the loop.
       If there is an overlap between the current interval and the new interval, merge them by updating the start and end of the new interval accordingly.
After merging is complete, add the new interval to the result list.
Iterate through the remaining intervals and add them to the result list.
Return the result list containing the merged intervals.

This approach ensures that we traverse the list of intervals only once, resulting in linear time complexity.
