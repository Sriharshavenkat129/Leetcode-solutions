class Solution {
     public int closedIsland(int[][] grid) {
    //     int m=grid.length,n=grid[0].length;
    //     int [][]visited=new int[m][n];
    //     int ans=0;
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(visited[i][j]==0 && grid[i][j]==0){
    //                 visited[i][j]=1;
    //                 if(isIland(i,j,grid,visited))ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // }
    // public boolean isIland(int r,int c, int[][] grid,int[][] visited){
    //     boolean iland=false;
    //     for(int i=r-1;i>=0;i--){
    //         if(visited[i][c]==1)return false;
    //         visited[i][c]=1;
    //         if(grid[i][c]==1){
    //             iland=true;
    //             break;
    //         }
    //     }
    //     if(!iland)return false;
    //     iland=false;
    //     for(int i=c-1;i>=0;i--){
    //         if(visited[r][i]==1)return false;
    //         visited[r][i]=1;
    //         if(grid[r][i]==1){
    //             iland=true;
    //             break;
    //         }
    //     }
    //     if(!iland)return false;
    //     iland=false;
    //     for(int i=r+1;i<grid.length;i++){
    //         if(visited[i][c]==1)return false;
    //         visited[i][c]=1;
    //         if(grid[i][c]==1){
    //             iland=true;
    //             break;
    //         }
    //     }
    //     if(!iland)return false;
    //     iland=false;
    //     for(int i=c+1;i<grid[0].length;i++){
    //         if(visited[r][i]==1)return false;
    //         visited[r][i]=1;
    //         if(grid[r][i]==1){
    //             iland=true;
    //             break;
    //         }
    //     }
    //     if(!iland)return false;
    //     return true;
    // }
    int m=grid.length,n=grid[0].length;
    for(int i=0;i<m;i++){
        if(grid[i][0]==0)dfs(grid,i,0);
        if(grid[i][n-1]==0)dfs(grid,i,n-1);
    }
    for(int i=0;i<n;i++){
        if(grid[0][i]==0)dfs(grid,0,i);
        if(grid[m-1][i]==0)dfs(grid,m-1,i);
    }
    int ans=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==0){
                ans++;
                dfs(grid,i,j);
            }
        }
    }
    return ans;
    }
    public void dfs(int[][] grid,int r,int c){
        if(r<0||r>grid.length-1||c>grid[0].length-1||c<0 || grid[r][c]==1)return;
        grid[r][c]=1;
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}