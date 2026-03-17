class Solution {
    public String reversePrefix(String s, int k) {
     if(k==1){
        return s;
     }
     StringBuilder ans=new StringBuilder("");
     for(int i=0;i<k;i++){
        ans.append(s.charAt(i));
     }
     ans=ans.reverse();
     for(int i=k;i<s.length();i++){
        ans.append(s.charAt(i));
     }
     return ans.toString();
    }
}