class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Start with prev as null and curr as head.
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            // Store next of curr.
            ListNode next = curr.next;
            // reverse the currpointer. 
            // Make curr.next point to prev.
            curr.next = prev;
 
            // Move prev and curr by 1 step.
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
