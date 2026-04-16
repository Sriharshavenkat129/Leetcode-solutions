class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        StringBuilder ans=new StringBuilder("");
        for(String word:words){
            for(int i=word.length()-1;i>=0;i--) ans.append(word.charAt(i));
            ans.append(" ");
        }
        return ans.substring(0,ans.length()-1).toString();
    }
}