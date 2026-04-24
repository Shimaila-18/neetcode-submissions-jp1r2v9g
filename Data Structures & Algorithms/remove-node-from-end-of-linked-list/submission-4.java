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

        //Used dummy to avoid writing for edge cases
        ListNode dummy= new ListNode(0,head);
        ListNode j = head;
        int count=0;
        while(count!=n){
            j=j.next;
            count++;
        }
        ListNode i = dummy;
         while(j!=null){
            j=j.next;
            i=i.next;
        }
        i.next=i.next.next;
        return dummy.next;


        // int count = 0;
        // ListNode j = head;
        // while(count!=n){
        //     j=j.next;
        //     count++;
        // }
        // ListNode i = null;
        // while(j!=null){
        //     j=j.next;
        //     if(i==null) i=head;
        //     else
        //     i=i.next;
        // }
        // if(i!=null){
        // i.next=i.next.next;
        // return head;
        // }else{
        // return head.next;
        // }
    }
}
