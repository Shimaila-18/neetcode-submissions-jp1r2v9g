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
    public void reorderList(ListNode head) {
        // 1. Find mid
        // 2. Reverse second half LL
        // 3. Then merge 
        if(head==null || head.next==null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode newSecond = reverse(second);
        ListNode curr1 = head;
        ListNode curr2 = newSecond;
        while(curr2!=null){
            ListNode firstNext = curr1.next;
            ListNode secondNext = curr2.next;
            curr1.next=curr2;
            curr2.next=firstNext;
            curr1=firstNext;
            curr2=secondNext;
        }

    }

    private ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
