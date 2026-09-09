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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        
        int len=1;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int stop=len-k;
        temp.next=head;
        temp=head;
       
        for(int i=1;i<stop;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}