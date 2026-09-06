class Solution {
    public int repeatedNTimes(int[] nums) {
        int cur=nums[0];
        for(int i=0;i<nums.length-2;i++){
            cur=nums[i];
            if(cur==nums[i+1] || cur==nums[i+2]){
                return cur;
            }
        }
        return nums[nums.length-1];
    }
}