class Solution {

    public ListNode reverseBetween(
        ListNode head,
        int left,
        int right
    ) {

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev before left
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Start of sublist
        ListNode current = prev.next;

        // Reverse using front insertion
        for (int i = 0; i < right - left; i++) {

            ListNode next = current.next;

            current.next = next.next;

            next.next = prev.next;

            prev.next = next;
        }

        return dummy.next;
    }
}