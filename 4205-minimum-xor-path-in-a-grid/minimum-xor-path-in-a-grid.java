class Solution {
    public int minCost(int[][] grid) {
      int m=grid.length,n=grid[0].length;
    //      int[][] dp=new int[m][n];
    //      dp[0][0]=grid[0][0];
    //      for(int i=1;i<m;i++){
    //          dp[i][0]=dp[i-1][0]^grid[i][0];
    //      }
    //      for(int i=1;i<n;i++){
    //          dp[0][i]=dp[0][i-1]^grid[0][i];
    //      }
    //      for(int i=1;i<m;i++){
    //          for(int j=1;j<n;j++){
    //              dp[i][j]=Math.min(grid[i][j]^dp[i-1][j],grid[i][j]^dp[i][j-1]);
    //          }
    //      }
    //      return dp[m-1][n-1];
    // //     int[] ans=new int[1];
    // //     ans[0]=Integer.MAX_VALUE;
    // //     getAns(grid,0,0,grid[0][0],ans);
    // //     return ans[0];
    // // }
    // // public static void getAns(int[][] grid,int r,int c,int cur,int[] ans){
    // //     if(r==grid.length-1 && c==grid[0].length-1){
    // //         ans[0]=Math.min(ans[0],cur);
    // //     }
    // //     if(r<grid.length-1)
    // //         getAns(grid,r+1,c,cur^grid[r+1][c],ans);
    // //     if(c<grid[0].length-1)
    // //         getAns(grid,r,c+1,cur^grid[r][c+1],ans);
    // // }
        boolean dp[][]=new boolean[n][1024];
        dp[0][0]=true;
        for(int i=0;i<m;i++){
            boolean [][] newdp=new boolean[n][1024];
            for(int j=0;j<n;j++){
                int val=grid[i][j];
                if(i>0){
                    for(int x=0;x<1024;x++){
                        if(dp[j][x])
                            newdp[j][x^val]=true;
                    }
                }
                if(j>0){
                    for(int x=0;x<1024;x++){
                        if(newdp[j-1][x])
                            newdp[j][x^val]=true;
                    }
                }
                if(i==0 && j==0)
                    newdp[i][val]=true;
            }
            dp=newdp;
        }
        for(int x=0;x<1024;x++){
            if(dp[n-1][x]){
                return x;
            }
        }
        return 0;
    }
}