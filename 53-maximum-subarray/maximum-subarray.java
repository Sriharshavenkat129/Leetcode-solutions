class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,cur=0;
        for(int n:nums){
            cur=Math.max(cur+n,n);
            max=Math.max(max,cur);
        }
        return max;
    }
}