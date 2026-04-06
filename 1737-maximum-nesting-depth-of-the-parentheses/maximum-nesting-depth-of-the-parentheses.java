class Solution {
    public int maxDepth(String s) {
        char arr[]=s.toCharArray();
        int ans=0;
        int balance=0;
        for(char ch:arr){
            if(ch=='(')balance++;
            else if(ch==')')balance--;
            ans=Math.max(ans,balance);
        }
        return ans;
    }
}