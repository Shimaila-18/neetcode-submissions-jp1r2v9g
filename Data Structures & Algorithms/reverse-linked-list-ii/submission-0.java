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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i=1;
        ListNode dummy = new ListNode(0,head);
        ListNode curr=head;
        ListNode leftPrev=dummy;
        while(i<left){
            leftPrev=curr;
            curr=curr.next;
            i++;
        }
        i=1;
        ListNode prev=null;
        while(i<=right-left+1){
            ListNode temp =curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            i++;
        }
        leftPrev.next.next=curr;
        leftPrev.next=prev;
        return dummy.next;
        
    }
}