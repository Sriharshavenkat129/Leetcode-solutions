class Solution {
    public boolean check(int[] nums) {
        int o=1;
        if(nums[0]<nums[nums.length-1])o=0;
        for(int i=0;i<nums.length-1;i++){
            if(o==1 && nums[i+1]<nums[i])o=0;
            else if(o==0 && nums[i+1]<nums[i])return false;
        }
        return true;
    }
}