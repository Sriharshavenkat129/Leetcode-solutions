class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans=new int[nums.length];
        int left=0,right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==1){
                ans[right]=1;
                right--;
            }
            else{
                ans[left]=0;
                left++;
            }
        }
        return ans;
    }
}