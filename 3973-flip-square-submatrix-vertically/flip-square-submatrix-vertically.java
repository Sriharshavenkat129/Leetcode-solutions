class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int col=y;col<y+k;col++){
            int start=x,end=x+k-1;
            while(start<end){
                int temp=grid[start][col];
                grid[start][col]=grid[end][col];
                grid[end][col]=temp;
                start++;
                end--;
            }
        }
        return grid;
    }
}