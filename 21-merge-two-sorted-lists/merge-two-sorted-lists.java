/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1=list1;
        ListNode p2=list2;

        if(p1==null) return p2;
        if(p2==null) return p1;

        if(p1.val>p2.val){
            p2.next=mergeTwoLists(p2.next,p1);
            return p2;
        }
        else{
            p1.next=mergeTwoLists(p1.next,p2);
            return p1;
        }

        
    }
}