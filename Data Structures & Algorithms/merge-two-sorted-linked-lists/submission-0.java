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
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode list3H = null;
        ListNode list3T = null;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                if(list3H==null){
                    list3H = temp1;
                    list3T = temp1;
                }else{
                    list3T.next = temp1;
                    list3T = list3T.next; 
                }
                temp1=temp1.next;
            }else{
                if(list3H==null){
                    list3H = temp2;
                    list3T = temp2;
                }else{
                    list3T.next = temp2;
                    list3T = list3T.next; 
                }
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            list3T.next = temp1;
            list3T = list3T.next; 
        }
        if(temp2!=null){
            list3T.next = temp2;
        }
        return list3H;
    }
}