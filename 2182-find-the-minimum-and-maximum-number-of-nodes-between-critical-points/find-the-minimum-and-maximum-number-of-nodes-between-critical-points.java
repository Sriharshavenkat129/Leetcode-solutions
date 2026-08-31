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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] ans=new int[2];
        ans[0]=Integer.MAX_VALUE;
        int startIndex=-1,currentIndex=-1;
        int index=1;
        int prev=-1;
        while(head.next!=null){
            int cur=head.val;
            if(prev==-1){
                prev=cur;
            }
            else{
                if(cur>prev && cur>head.next.val){
                    if(currentIndex==-1){
                        currentIndex=index;
                        startIndex=index;
                    }
                    else{
                        ans[0]=Math.min(ans[0],index-currentIndex);
                        currentIndex=index;
                    }
                }
                else if(cur<prev && cur<head.next.val){
                    if(currentIndex==-1){
                        currentIndex=index;
                        startIndex=index;
                    }
                    else{
                        ans[0]=Math.min(ans[0],index-currentIndex);
                        currentIndex=index;
                    }
                }
            }
            prev=cur;
            index++;
            head=head.next;
        }
        if(ans[0]==Integer.MAX_VALUE)return new int[]{-1,-1};
        ans[1]=currentIndex-startIndex;
        return ans;
    }
}