class Solution {
    public int largestAltitude(int[] gain) {
        int heighest=0;
        int cur=0;
        for(int i=0;i<gain.length;i++){
            cur+=gain[i];
            heighest=Math.max(heighest,cur);
        }
        return heighest;
    }
}