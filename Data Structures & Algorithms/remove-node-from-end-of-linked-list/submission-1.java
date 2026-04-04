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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        while(n>0){
            first=first.next;
            n--;
        }
        if(first==null){
            return head.next;
        }
        first=first.next;
        ListNode second = head;
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next =  second.next.next;
        return head;

        
    }
}
