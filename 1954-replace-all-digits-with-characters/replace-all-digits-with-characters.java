class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans=new StringBuilder("");
        char pre=' ';
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                ans.append(ch);
                pre=ch;
            }
            else{
                int n=ch-'0';
                ans.append((char)(pre+n));
            }
        }
        return ans.toString();
    }
}