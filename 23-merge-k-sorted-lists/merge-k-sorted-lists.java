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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        else if(lists.length==1)return lists[0]==null?null:lists[0];
        ListNode ans=lists[0];
        for(int i=1;i<lists.length;i++){
            if(ans!=null && lists[i]!=null){
                ans=merge(ans,lists[i]);
            }
            else if(ans==null)ans=lists[i];
        }
        return ans;
    }
    public static ListNode merge(ListNode t1,ListNode t2){
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                temp.next=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                t2=t2.next;
            }
            temp=temp.next;
        }
        if(t1!=null) temp.next=t1;
        if(t2!=null)temp.next=t2;
        return head.next;
    }
}