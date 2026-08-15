class Solution {
    public int longestSubsequence(int[] nums) {
        if(nums.length==1 && nums[0]==0)return 0;
        if(nums.length==1)return 1;
        int current_xor=nums[0];
        int allZeroes=nums[0];
        for(int i=1;i<nums.length;i++){
            current_xor^=nums[i];
            allZeroes+=nums[i];
        }
        if(current_xor!=0)return nums.length;
        if(allZeroes==0)return 0;
        return nums.length-1;
        // int left=0;
        // int ans=0;
        // current_xor=nums[0];
        // for(int right=1;right<nums.length;right++){
        //     while(left <nums.length && (current_xor^nums[right])==0){
        //         current_xor^=nums[left];
        //         left++;
        //     }
        //     current_xor^=nums[right];
        //     ans=Math.max(ans,right-left+1);
        // }
        // return ans;
    }
}