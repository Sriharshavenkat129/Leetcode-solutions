class Solution {
    public int maximumLengthSubstring(String s) {
        int[] counts=new int[26];
        int ans=0;
        int pre=0;
        int newans=0;
        for(char ch:s.toCharArray()){
            counts[ch-'a']+=1;
            newans++;
            if(counts[ch-'a']>2){
            while(counts[ch-'a']>2){
                counts[s.charAt(pre)-'a']-=1;
                newans-=1;
                pre++;
            }
            }
            ans=Math.max(newans,ans);
        }
        return ans;
    }
}