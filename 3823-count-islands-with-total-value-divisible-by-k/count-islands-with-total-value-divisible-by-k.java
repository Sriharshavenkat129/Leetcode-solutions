class Solution {
    public int countIslands(int[][] grid, int k) {
        int ans=0;
        long[] sum=new long[1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    sum[0]=0;
                    dfs(grid,i,j,sum);
                    if(sum[0]%k==0)ans++;
                }
            }
        }
        return ans;
    }
    public static void dfs(int[][]grid,int r,int c,long []sum){
        if(r<0||c<0||c>grid[0].length-1||r>grid.length-1||grid[r][c]==0)return;
        sum[0]+=grid[r][c];
        grid[r][c]=0;
        dfs(grid,r-1,c,sum);
        dfs(grid,r+1,c,sum);
        dfs(grid,r,c-1,sum);
        dfs(grid,r,c+1,sum);
    }
}