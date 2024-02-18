Intuition:-

When merging two sorted linked lists, the goal is to efficiently combine the elements of both lists into a single sorted list.
The process involves comparing the values of the current nodes of the two lists and selecting the smaller value to append it to the merged list.
This iterative comparison and selection continue until all nodes from both lists are processed, resulting in a merged list that maintains the sorted order.

Approach:-

Initialize a dummy node (dummy) to serve as the head of the merged list and a current pointer (curr) to keep track of the current node.
Iterate through both lists (l1 and l2) simultaneously until either of them becomes null.
During each iteration:
Compare the values of the current nodes of l1 and l2.
Append the node with the smaller value to the merged list.
Move the pointer of the merged list (curr) and the pointer of the smaller node's list (l1 or l2) to the next node.
After the loop, append the remaining nodes of the non-empty list to the merged list.
Return the next node of the dummy node, which is the head of the merged list.
This approach efficiently merges the two lists in ascending order while iterating through them once, ensuring a sorted result.
