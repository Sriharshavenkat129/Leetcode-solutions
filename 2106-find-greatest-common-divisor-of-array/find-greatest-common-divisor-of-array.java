class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        while(max!=0){
            int tem=min%max;
            min=max;
            max=tem;
        }
        return min;
    }
}