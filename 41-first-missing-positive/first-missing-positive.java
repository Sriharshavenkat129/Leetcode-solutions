class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] count=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<=nums.length){
                count[nums[i]-1]=nums[i];
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=i+1)return i+1;
        }
        return nums.length+1;
    }
}