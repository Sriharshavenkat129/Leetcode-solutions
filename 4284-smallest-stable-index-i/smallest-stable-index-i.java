class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0],min=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=nums[i];
            for(int j=i;j<nums.length;j++){
                min=Math.min(nums[j],min);
            }
            if((max-min)<=k)return i;
        }
        return -1;
    }
}