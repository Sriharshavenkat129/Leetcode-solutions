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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=slow.next;
        ListNode temp=pre.next;
        pre.next=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=pre;
            pre=temp;
            temp=next;
        }
        slow.next=pre;
        int ans=Integer.MIN_VALUE;
        fast=slow.next;
        slow=head;
        while(fast!=null){
            ans=Math.max(ans,slow.val+fast.val);
            fast=fast.next;
            slow=slow.next;
        }
        return ans;
    }
}