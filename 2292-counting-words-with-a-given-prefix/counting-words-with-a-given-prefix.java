class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans=0;
        for(String str:words){
            if(str.length()>=pref.length() && str.substring(0,pref.length()).equals(pref)) ans++;
        }
    return ans;
    }
}