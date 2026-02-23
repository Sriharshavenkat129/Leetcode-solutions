class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int index=getMinIndex(nums);
            nums[index]*=multiplier;
        }
        return nums;
    }
    public int getMinIndex(int[] nums){
        int index=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                index=i;
                min=nums[i];
            }
        }
        return index;
    }
}