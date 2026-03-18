class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int m=1;
       // System.out.println(97-'z'+26);
        for(char ch:s.toCharArray()){
            int n=97-(int)ch+26;
            ans+=(m*n);
            m++;        
        }
        return ans;
    }
}