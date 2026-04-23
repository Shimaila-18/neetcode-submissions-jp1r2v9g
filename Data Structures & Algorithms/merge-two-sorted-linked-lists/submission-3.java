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
        if(list1==null) return list2;
        if(list2==null) return list1;
        //using recursion
        ListNode newHead=null;
        if(list1.val<list2.val){
        list1.next=mergeTwoLists(list1.next,list2);
        newHead=list1;
        }else{
            list2.next=mergeTwoLists(list1,list2.next);
            newHead=list2;
        }
        return newHead;

    }
}

//Sol2 : 
// ListNode dummy = new ListNode(0);
//         ListNode node = dummy;
//         ListNode curr1 = list1;
//         ListNode curr2 = list2;
//         while(curr1!=null && curr2!=null){
//             if(curr1.val<curr2.val){
//                 node.next=curr1;
//                 curr1=curr1.next;
//             }else{
//                 node.next=curr2;
//                 curr2=curr2.next;
//             }
//             node=node.next;
//         }
//         if(curr1!=null){
//             node.next=curr1;
//         }
//         if(curr2!=null){
//             node.next=curr2;
//         }
//         return dummy.next;

//Sol1 :

// if(list1==null){
//             return list2;
//         }else if(list2==null){
//             return list1;
//         }
//         ListNode newHead = null;
//         ListNode temp = null;
//         ListNode curr1 = list1;
//         ListNode curr2 = list2;
//         while(curr1!=null && curr2!=null){
//             if(curr1.val<curr2.val){
//                 if(newHead==null){
//                     newHead=curr1;
//                     temp=newHead;
//                 }else{
//                     temp.next=curr1;
//                     temp=temp.next;
//                 }
//                 curr1=curr1.next;
//             }else{
//                 if(newHead==null){
//                     newHead=curr2;
//                     temp=newHead;
//                 }else{
//                     temp.next=curr2;
//                     temp=temp.next;
//                 }
//                 curr2=curr2.next;
//             }
//         }
//         if(curr1!=null){
//             temp.next=curr1;
//         }
//         if(curr2!=null){
//             temp.next=curr2;
//         }
//         return newHead;