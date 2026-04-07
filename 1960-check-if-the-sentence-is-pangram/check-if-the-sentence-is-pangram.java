class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        int[] counts=new int[26];
        int count=0;
        for(char ch:sentence.toCharArray()){
            counts[ch-97]+=1;
            if(counts[ch-97]==1) count++;
            if(count==26) return true;
        }
        return false;
    }
}