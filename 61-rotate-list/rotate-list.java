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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int n=0;
        ListNode temp=head;
        ListNode tail=null;
        while(temp!=null){
            tail=temp;
            n++;
            temp=temp.next;
        }
        k=k%n;
       // System.out.println(n+" "+k);
        if(k==0) return head;
        k=n-k;
        temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        ListNode newtemp=temp.next;
        temp.next=null;
        tail.next=head;
        head=newtemp;
        return head;
    }
}