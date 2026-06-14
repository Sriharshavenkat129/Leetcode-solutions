class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        int[][] board=new int[n][n];
        placeQueens(board,0,ans);
        return ans;
    }
    public static void placeQueens(int[][] board,int r,List<List<String>>ans){
        if(r==board.length){
            AddBoard(board,ans);
            System.out.println("something");
            return ;
        }
        for(int c=0;c<board.length;c++){
            if(IsValid(r,c,board)){
                board[r][c]=1;
                placeQueens(board,r+1,ans);
                board[r][c]=0;
            }
        }
    }
    public static boolean IsValid(int r,int c,int[][] board){
       for(int i=r;i>=0;i--){
        if(board[i][c]==1)return false;
       }
       int row=r,col=c;
       while(row>=0 && col>=0){
        if(board[row][col]==1)return false;
        row--;
        col--;
       }
       row=r;
       col=c;
       while(row>=0 && col<board.length){
        if(board[row][col]==1)return false;
        row--;
        col++;
       }
       return true;
    }
    public static void AddBoard(int[][] board,List<List<String>>ans){
        List<String> l=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str="";
            for(int j=0;j<board.length;j++){
                str+=board[i][j]==1?"Q":".";
            }
            l.add(str);
        }
        ans.add(l);
    }
}