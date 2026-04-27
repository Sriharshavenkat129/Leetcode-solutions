class Solution {
    public boolean isBalanced(String s) {
        int odd=0,even=0;
        for(int i=0;i<s.length();i+=2){
            odd+=s.charAt(i)-'0';
            if(i+1<s.length())even+=s.charAt(i+1)-'0';
        }   
        return odd==even;
    }
}