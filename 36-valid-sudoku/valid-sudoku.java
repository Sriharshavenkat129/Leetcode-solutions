class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<board.length;i++){
            set.clear();
            int count=0;
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    set.add((int)board[i][j]);
                    count++;
                }
            }
            if(count>set.size()){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            set.clear();
            int count=0;
            for(int j=0;j<board.length;j++){
                if(board[j][i]!='.'){
                    set.add((int)board[j][i]);
                    count++;
                }
            }
            if(count>set.size()){
                return false;
            }
        }
        for(int i=0;i<3;i++){
            int count=0;
            for(int j=0;j<9;j++){
                if(j==0||j==3||j==6){
                    set.clear();
                    count=0;
                }
                for(int k=3*i;k<3*i+3;k++){
                    if(board[j][k]!='.'){
                        set.add((int)board[j][k]);
                        count++;
                    }
                }
                if(count>set.size())return false;
            }
        }
        return true;
    }
}