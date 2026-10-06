class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')count++;
            else count--;
            if(count<0){
                ans++;
                count=0;
            }
        }
        return ans+count;
    }
}