class Solution {
    public String replaceDigits(String s) {
        String ans="";
        char pre=' ';
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                ans+=ch;
                pre=ch;
            }
            else{
                int n=ch-'0';
                ans+=(char)(pre+n);
            }
        }
        return ans;
    }
}