class Solution {

    public ListNode sortList(ListNode head) {

        // BASE CASE
        if (head == null || head.next == null) {
            return head;
        }

        // STEP 1: find middle
        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;

        // break list into two halves
        mid.next = null;

        // STEP 2: recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // STEP 3: merge sorted halves
        return merge(left, right);
    }

    // FIND MIDDLE
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // MERGE TWO SORTED LISTS
    private ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        // attach remaining nodes
        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummy.next;
    }
}