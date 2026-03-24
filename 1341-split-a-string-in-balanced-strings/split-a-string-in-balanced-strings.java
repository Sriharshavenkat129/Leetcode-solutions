class Solution {
    public int balancedStringSplit(String s) {
        int i=0,ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='R')i++;
            else i--;
            if(i==0) ans++;
        }
        return ans;
    }
}