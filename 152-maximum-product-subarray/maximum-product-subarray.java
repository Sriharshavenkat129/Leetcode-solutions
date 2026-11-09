class Solution {
    public int maxProduct(int[] nums) {
        // int ans=nums[0];
        // int m=nums.length;
        // int[][] dp=new int[m][m];
        // dp[0][0]=nums[0];
        // for(int i=1;i<m;i++){
        //     dp[i][0]=nums[i];
        //     ans=Math.max(dp[i][0],ans);
        //     for(int j=1;j<=i;j++){
        //         dp[i][j]=dp[i-1][j-1]*nums[i];
        //         ans=Math.max(dp[i][j],ans);
        //     }
        // }
        // return ans;
        int ans=nums[0],max=nums[0],min=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            if(cur<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(cur,cur*max);
            min=Math.min(cur,cur*min);

            ans=Math.max(ans,max);
        }
        return ans;
    }
}