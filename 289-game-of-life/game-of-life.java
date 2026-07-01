class Solution {
    public void gameOfLife(int[][] board) {
        int[][] mat=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                mat[i][j]=board[i][j];
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=getValue(mat,i,j);
            }
        }
    }
    public static int getValue(int[][] mat,int r,int c){
        int dead=0,alive=0;
        if(r-1>=0 && c-1>=0 && r-1<mat.length && c-1<mat[0].length){
            if(mat[r-1][c-1]==1)alive++;
            else dead++;
        }
        if(r-1>=0 && c>=0  && r-1<mat.length && c<mat[0].length){
            if(mat[r-1][c]==1)alive++;
            else dead++;
        }
        if(r-1>=0 && c+1>=0 && r-1<mat.length && c+1<mat[0].length){
            if(mat[r-1][c+1]==1)alive++;
            else dead++;
        }
        if(r>=0 && c-1>=0 && r<mat.length && c-1<mat[0].length){
            if(mat[r][c-1]==1)alive++;
            else dead++;
        }
        if(r>=0 && c+1>=0 && r<mat.length && c+1<mat[0].length){
            if(mat[r][c+1]==1)alive++;
            else dead++;
        }
        if(r+1>=0 && c-1>=0 && r+1<mat.length && c-1<mat[0].length){
            if(mat[r+1][c-1]==1)alive++;
            else dead++;
        }
        if(r+1>=0 && c>=0 && r+1<mat.length && c<mat[0].length){
            if(mat[r+1][c]==1)alive++;
            else dead++;
        }
        if(r+1>=0 && c+1>=0 && r+1<mat.length && c+1<mat[0].length){
            if(mat[r+1][c+1]==1)alive++;
            else dead++;
        }
        if(mat[r][c]==1){
            if(alive<2)return 0;
            else if(alive>3)return 0;
            else return 1;
        }
        else{
            return alive==3?1:0;
        }
    }
}