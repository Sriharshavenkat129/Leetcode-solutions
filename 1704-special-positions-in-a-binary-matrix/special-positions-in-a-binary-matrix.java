class Solution {
    public int numSpecial(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    ans+=check(mat,i,j)?1:0;
                }
            }
        }
        return ans;
    }
    public static boolean check(int[][] mat,int r,int c){
        for(int i=r-1;i>=0;i--){
            if(mat[i][c]==1) return false;
        }
        for(int i=r+1;i<mat.length;i++){
            if(mat[i][c]==1) return false;
        }
        for(int j=c-1;j>=0;j--){
            if(mat[r][j]==1) return false;
        }
        for(int j=c+1;j<mat[r].length;j++){
            if(mat[r][j]==1) return false;
        }
        return true;
    }
}