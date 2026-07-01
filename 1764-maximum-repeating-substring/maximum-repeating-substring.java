class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans=0;
        String pattern=word;
        while(sequence.contains(word)){
            ans++;
            word=word+pattern;
        }
        return ans;
    }
}