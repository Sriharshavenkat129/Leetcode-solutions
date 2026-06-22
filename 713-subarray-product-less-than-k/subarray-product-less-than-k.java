class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        if(k<=1)return 0;
        int current_sum=1;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            current_sum*=nums[right];
            while(current_sum>=k){
                current_sum/=nums[left++];
            }
            ans+=right-left+1;
        }
        return ans;
    }
}