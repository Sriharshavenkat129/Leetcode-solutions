class Solution {
    public int climbStairs(int n, int[] costs) {
        if(n==1)return costs[0]+1;
        int[][] dp=new int[n][3];
        dp[0][0]=costs[0]+1;
        dp[0][1]=dp[0][0];
        dp[0][2]=dp[0][0];
        if(n>=2){
            dp[1][0]=dp[0][0]+1+costs[1];
            dp[1][1]=costs[1]+4;
            dp[1][2]=dp[1][0];
        }
        if(n>=3){
            dp[2][0]=Math.min(dp[1][0],dp[1][1])+costs[2]+1;
            dp[2][1]=4+costs[2]+dp[0][0];
            dp[2][2]=9+costs[2];
        }
        for(int i=3;i<n;i++){
            dp[i][0]=Math.min(dp[i-1][0],Math.min(dp[i-1][1],dp[i-1][2]))+costs[i]+1;
            dp[i][1]=Math.min(dp[i-2][0],Math.min(dp[i-2][1],dp[i-2][2]))+costs[i]+4;
            dp[i][2]=Math.min(dp[i-3][0],Math.min(dp[i-3][1],dp[i-3][2]))+costs[i]+9;
        }
        return Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));
    }
}