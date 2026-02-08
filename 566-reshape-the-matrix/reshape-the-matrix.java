class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int current_length=0;
        for(int i=0;i<mat.length;i++){
            current_length+=mat[i].length;
        }
        if(current_length!=r*c)
        return mat;
        int[][] ans=new int[r][c];
        int row=0,col=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                ans[row][col]=mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return ans;
    }
}