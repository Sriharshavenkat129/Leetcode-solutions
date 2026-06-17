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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        ListNode newhead=dummy;
        while(temp!=null){
            if(temp.next!=null && temp.val==temp.next.val){
                System.out.println("if occured!");
               ListNode nextNode=temp.next;
               while(temp!=null && nextNode!=null && nextNode.val==temp.val){
                    temp=temp.next;
                    nextNode=nextNode.next;
               }
               temp.next=null;
               temp=nextNode;
            }
            else{
                System.out.println("else occured!");
                dummy.next=temp;
                dummy=dummy.next;
                temp=temp.next;
            }
        }
        dummy.next=null;
        return newhead.next;
    }
}