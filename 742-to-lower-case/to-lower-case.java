class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans=new StringBuilder("");
        for(char ch:s.toCharArray()){
            if((int)ch>=65 && (int)ch<=90)ans.append((char)(ch+32));
            else ans.append(ch);
        }
        return ans.toString();
    }
}