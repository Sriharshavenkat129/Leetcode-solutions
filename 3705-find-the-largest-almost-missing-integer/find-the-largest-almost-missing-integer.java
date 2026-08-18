class Solution {
    public int largestInteger(int[] nums, int k) {
        int [] counts=new int[51];
        if(k==nums.length){
            int ans=nums[0];
            for(int n:nums){
                ans=Math.max(ans,n);
            }
            return ans;
        }
        for(int n:nums)counts[n]++;
        if(k==1){
            for(int i=50;i>=0;i--){
                if(counts[i]==1)return i;
            }
            return -1;
        }
        int ans=-1;
        System.out.println(Arrays.toString(counts));
        if(counts[nums[0]]==1)ans=Math.max(ans,nums[0]);
        if(counts[nums[nums.length-1]]==1)ans=Math.max(ans,nums[nums.length-1]);
        return ans;
    }
}