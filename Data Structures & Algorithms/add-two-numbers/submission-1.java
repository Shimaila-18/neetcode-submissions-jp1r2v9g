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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        ListNode curr1=l1;
        ListNode curr2=l2;
        int carry=0;
        while(curr1!=null || curr2!=null ){
            int a=0;int b=0;
            if(curr1!=null)
            a = curr1.val;
            if(curr2!=null)
            b = curr2.val;
            int sum=a+b+carry;
            ListNode node=new ListNode(sum%10);
            curr.next=node;
            curr=node;
            carry=sum/10;
            if(curr1!=null)
            curr1=curr1.next;
            if(curr2!=null)
            curr2=curr2.next;
        }
        if(carry!=0){
            ListNode node=new ListNode(carry);
            curr.next=node;
        }
        return dummy.next;
    }
}
