class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                 if(isValid(board,0,word,i,j)) return true;
            }
        }
        return false;
    }
    public static boolean isValid(char [][] board,int index,String word,int r,int c){
        if(index==word.length()) return true;
        if (r<0 || r>=board.length || c<0 || c>=board[r].length || word.charAt(index)!=board[r][c] ) return false;
        char ch=board[r][c];
        board[r][c]='#';
        boolean validity=isValid(board,index+1,word,r+1,c)||isValid(board,index+1,word,r-1,c)||isValid(board,index+1,word,r,c+1)||isValid(board,index+1,word,r,c-1);
        board[r][c]=ch;
        return validity;
    }
}