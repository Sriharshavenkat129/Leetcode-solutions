/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       /*
        if(headA==null || headB ==null)
        return null;
        ArrayList<ListNode> arr=new ArrayList<ListNode>();
        ListNode temp=headA;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(arr.contains(temp))
            return temp;
            temp=temp.next;
        }
        return null;
    */
    if(headA==null || headB==null)
    return null;
    ListNode a=headA,b=headB;
    while(a!=b){
        a=a!=null?a.next:headB;
        b=b!=null?b.next:headA;
    }
    return a;
    
    }
}