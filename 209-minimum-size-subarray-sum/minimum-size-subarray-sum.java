class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int current_sum=0,ans=nums.length+1;
        for(int i=0;i<nums.length;i++){
            current_sum+=nums[i];
            while(left<nums.length && current_sum>=target){
                ans=Math.min(ans,i-left+1);
                current_sum-=nums[left];
                left++;
            }
        }
        // while(current_sum>=target && left<nums.length){
        //     ans=Math.min(ans,nums.length-left);
        //     current_sum-=nums[left];
        //     left++;
        // }
        return ans==nums.length+1?0:ans;
    }
}