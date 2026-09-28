class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int ans=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')count++;
            else if(s.charAt(i)==')')count--;
            ans=Math.max(ans,count);
        }
        return ans;
    }
}