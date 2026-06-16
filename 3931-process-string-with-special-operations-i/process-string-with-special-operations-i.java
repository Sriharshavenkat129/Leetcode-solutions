class Solution {
    public String processStr(String s) {
        StringBuilder ans=new StringBuilder("");
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                if(ans.length()!=0)ans=new StringBuilder(ans.substring(0,ans.length()-1));
            }
            else if(ch=='#'){
                ans.append(ans);
            }
            else if(ch=='%'){
                ans=ans.reverse();
            }
            else ans.append(ch);
        }
        return ans.toString();
    }
}