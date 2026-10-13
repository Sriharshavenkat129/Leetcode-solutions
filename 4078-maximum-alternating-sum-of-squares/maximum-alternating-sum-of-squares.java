class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int start=0,end=nums.length-1;
        while(start<end){
            ans+=nums[end]-nums[start];
            start++;
            end--;
        }
        if(start==end)ans+=nums[start];
        return ans;
    }
}