class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(String s:sentences){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ') count++;
            }
            ans=Math.max(ans,count);
        }
    return ans+1;
}
}