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
        int count = 0;
        ListNode j = head;
        while(count!=n){
            j=j.next;
            count++;
        }
        ListNode i = null;
        while(j!=null){
            j=j.next;
            if(i==null) i=head;
            else
            i=i.next;
        }
        if(i!=null){
        i.next=i.next.next;
        return head;
        }else{
        return head.next;
        }
    }
}
