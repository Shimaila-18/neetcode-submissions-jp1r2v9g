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

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry = 0; 
        while(l1!= null && l2!=null){
            int sum = l1.val+l2.val + carry;
            carry = sum/10;
            ListNode curr = new ListNode(sum%10);
            l3.next=curr;
            l3 = curr;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!= null){
            int sum = l1.val+ carry;
            carry = sum/10;
            ListNode curr = new ListNode(sum%10);
            l3.next=curr;
            l3 = curr;
            l1 = l1.next;
        }
        while(l2!= null){
            int sum = l2.val+ carry;
            carry = sum/10;
            ListNode curr = new ListNode(sum%10);
            l3.next=curr;
            l3 = curr;
            l2 = l2.next;
        }
        if(carry!=0){
            ListNode curr = new ListNode(carry);
            l3.next=curr;
            l3 = curr;
        }
        return dummy.next;
    }
}
