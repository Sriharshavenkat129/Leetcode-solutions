class Solution {
    public String toLowerCase(String s) {
        String ans="";
        for(char ch:s.toCharArray()){
            if((int)ch>=65 && (int)ch<=90)ans+=(char)(ch+32);
            else ans+=ch;
        }
        return ans;
    }
}