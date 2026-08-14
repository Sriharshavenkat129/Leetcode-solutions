class Solution {
    public int maximumLengthSubstring(String s) {
        int [] counts=new int[26];
        int ans=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(counts[ch-'a']>=2){
                counts[s.charAt(left)-'a']--;
                left++;
            }
            counts[ch-'a']++;
            ans=Math.max(right-left+1,ans);
        }
        return ans;
    }
}