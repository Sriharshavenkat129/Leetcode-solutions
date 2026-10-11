class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0,index=1;
        for(int i:nums){
            if(nums.length%index==0)ans=ans+(i*i);
            index++;
        }   
        return ans;
    }
}