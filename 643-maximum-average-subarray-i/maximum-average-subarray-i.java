class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k>nums.length || nums.length==0)return -1;
        int pre=0;
        int current_sum=0;
        for(int i=0;i<k;i++)current_sum+=nums[i];
        double ans=(double)current_sum/k;
        for(int i=k;i<nums.length;i++){
            current_sum=current_sum+nums[i]-nums[pre];
            pre++;
            //System.out.println(current_sum/k);
            ans=Math.max(ans,(double)current_sum/k);
        }
        return ans;
    }
}