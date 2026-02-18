class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans=new int[grid.length-2][grid.length-2];
        int max=0;
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid.length-2;j++){
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        max=Math.max(max,grid[r][c]);
                    }
                }
                ans[i][j]=max;
                max=0;
            }
        }
        return ans;
    }
}