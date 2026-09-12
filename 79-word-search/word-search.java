class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(isPossible(i,j,word,board,0))
                return true;
            }
        }
        return false;
    }
    public boolean isPossible(int r,int c,String word,char[][] board,int size){
        if(size==word.length())return true;
        if(r<0 || c<0 || r==board.length || c==board[0].length || word.charAt(size)!=board[r][c])
        return false;
        char ch=board[r][c];
        board[r][c]='#';
        boolean status=isPossible(r+1,c,word,board,size+1) || isPossible(r-1,c,word,board,size+1) || isPossible(r,c+1,word,board,size+1) || isPossible(r,c-1,word,board,size+1);
        board[r][c]=ch;
        return status;
    }
}