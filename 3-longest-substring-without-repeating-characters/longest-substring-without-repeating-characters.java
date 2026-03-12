class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        int st=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(st));
                st++;
            }
            set.add(ch);
            ans=Math.max(ans,set.size());
        }
        return ans;
    }
}