class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // Convert linked list to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] res = new int[n];

        // Check for next greater element
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) > list.get(i)) {
                    res[i] = list.get(j);
                    break; // stop at first greater element
                }
            }
        }

        return res;
    }
}