class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int n:nums)max=Math.max(max,n);
        int ans=0;
        for(int n:nums)ans=ans+(max-n);
        return ans;
    }
}