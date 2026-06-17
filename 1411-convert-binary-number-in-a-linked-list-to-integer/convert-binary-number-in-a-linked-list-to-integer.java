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
    int ans=0;
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            ans=ans<<1;
            if(temp.val==1)ans+=1;
            temp=temp.next;
        }
        return ans;
    }
}