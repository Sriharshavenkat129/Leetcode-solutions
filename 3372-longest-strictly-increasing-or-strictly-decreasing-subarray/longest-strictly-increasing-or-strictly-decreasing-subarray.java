class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        for(int i=0;i<nums.length;i++){
            int count=1,asc=1;
            int pre=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[i+1])asc=0;
                if(asc==1 && nums[j]>pre){
                    pre=nums[j];
                    count++;
                }
                else if(asc==0 && nums[j]<pre){
                    pre=nums[j];
                    count++;
                }
                else break;
            }
            ans=Math.max(count,ans);
        }
        return ans;
    }
}