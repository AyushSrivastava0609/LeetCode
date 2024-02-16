class Solution {
    public int numComponents(ListNode head, int[] nums) {
        // Create as hashset of array elements.
        int groupsCount = 0;
        Set<Integer> hashset = new HashSet<>();
        for (int element: nums) {
            hashset.add(element);
        }
 
        // Traverse linkedlist, wherever an element is present in hashset 
        // and its previous element is not present in hashset, 
        // then increase the count of groups.
        Boolean previousElementPresent = false;
        while (head != null) {
            if (hashset.contains(head.val)) {
                // current element in linkedlist is present in hashset.
                if (previousElementPresent == false) {
                    groupsCount++;
                }
            }
 
            previousElementPresent = hashset.contains(head.val);
 
            head = head.next;
        }
        return groupsCount;
    }
}
