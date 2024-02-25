Intuition:-

We're utilizing the concept of two pointers moving through the linked list at different speeds.
If there's a cycle, eventually the faster pointer will catch up to the slower pointer.

Approach:-

Initialization:
We start with two pointers, slow and fast, both pointing to the head of the linked list.

Traversal:
In each iteration, slow moves one step forward (slow = slow.next), and fast moves two steps forward (fast = fast.next.next).
This way, fast moves twice as fast as slow through the linked list.

Cycle Detection:
If there's a cycle in the linked list, eventually the faster fast pointer will catch up to the slower slow pointer.
At each step, we check if slow is equal to fast. If they meet, it indicates the presence of a cycle in the linked list.

Termination:
If there's no cycle, the fast pointer will reach the end of the list (i.e., become null) before catching up to the slow pointer.
In this case, the traversal terminates, and we return false indicating no cycle.

Return Value:
If during traversal, we find slow equal to fast, we return true, indicating the presence of a cycle.

Complexity Analysis:
Time Complexity: O(n), where n is the number of nodes in the linked list. Both pointers traverse the list linearly, with the fast pointer moving twice as fast as the slow pointer.
Space Complexity: O(1), as we're using only two pointers regardless of the size of the linked list.

This approach efficiently detects cycles in a linked list by leveraging the relative speeds of two pointers, making it a widely-used technique for cycle detection in linked lists.
