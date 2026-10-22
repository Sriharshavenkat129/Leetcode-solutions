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
        if(l1.val==0 && l1.next==null)
        return l2;
        if(l2.val==0 && l2.next==null)
        return l1;
        int remainder=0;
        int idex=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode temp2head=null;
        ListNode newtemp=null;
        ListNode newend=null;
        while(temp1!=null || temp2!=null){
            if(temp1!=null && temp2!= null){
                int sum=temp1.val+temp2.val+remainder;
                if(sum>9){
                    temp1.val=sum%10;
                    remainder=1;
                }
                else{
                    temp1.val=sum;
                    remainder=0;
                }
            }
            else if(temp1!=null){
                int sum=temp1.val+remainder;
                if(sum>9){
                sum=sum%10;
                remainder=1;
                }
                else{
                    remainder=0;
                }
                temp1.val=sum;
            }
            else{
                int sum=temp2.val+remainder;
                if(sum>9){
                sum=sum%10;
                remainder=1;
                }
                else{
                    remainder=0;
                }
                temp2.val=sum;
            }
            if(temp1!=null && temp1.next==null){
                newtemp=temp1;
                if(temp2!=null && temp2.next!=null){
                idex=1;
                temp2head=temp2.next;
                }
            }
            if(temp2!=null && temp2.next==null){
                newend=temp2;
            }
        if(temp1!=null)
        temp1=temp1.next;
        if(temp2!=null)
        temp2=temp2.next;
        }
        if(idex==1){
            newtemp.next=temp2head;
        }
        if(remainder==1){
            ListNode newnode=new ListNode();
            newnode.val=1;
            if(idex==1){
                newend.next=newnode;
            }            
            else{
                newtemp.next=newnode;
            }
        }
        return l1;
    }
}