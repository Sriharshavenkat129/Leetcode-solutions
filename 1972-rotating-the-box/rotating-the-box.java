class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        for(int i=0;i<boxGrid.length;i++){
            int count=0;
            int start=0;
            for(int j=0;j<boxGrid[i].length;j++){
                if(boxGrid[i][j]=='#')count++;
                if(boxGrid[i][j]=='*'){
                    drop(boxGrid,i,j,count,start);
                    count=0;
                    start=j+1;
                }
            }
            drop(boxGrid,i,boxGrid[i].length,count,start);
        }
        char[][] ans=new char[boxGrid[0].length][boxGrid.length];
        for(int i=0;i<boxGrid.length;i++){
            for(int j=0;j<boxGrid[i].length;j++){
                ans[j][i]=boxGrid[i][j];
            }
        }
        for(int i=0;i<ans.length;i++){
            int start=0,end=ans[i].length-1;
            while(start<end){
                char t=ans[i][start];
                ans[i][start]=ans[i][end];
                ans[i][end]=t;
                start++;
                end--;
            }
        }
        return ans;
    }
    public static void drop(char[][] grid,int r,int c,int count,int start){
        for(int i=c-1;i>=start;i--){
            if(count>0)grid[r][i]='#';
            else grid[r][i]='.';
            count--;
        }
    }
}