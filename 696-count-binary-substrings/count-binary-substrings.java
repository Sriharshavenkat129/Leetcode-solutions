class Solution {
    public int countBinarySubstrings(String s) {
        if(s.length()<=1) return 0;
        char pre=s.charAt(0);
        int ans=0;
        int count_1=0;
        int count_0=0;
        if(pre=='0')count_0++;
        else count_1++;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(pre!=ch && count_1>0 && count_0>0){
                ans+=Math.min(count_0,count_1);
                if(ch=='0') count_0=1;
                else count_1=1;
            }
            else {
                if(ch=='0')count_0++;
                else count_1++;
            }
            pre=ch;
        }
        ans+=Math.min(count_1,count_0);
        return ans;
    }
}