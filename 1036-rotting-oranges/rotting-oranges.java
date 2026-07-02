class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)fresh++;
                else if(grid[i][j]==2){
                    int[] idx=new int[2];
                    idx[0]=i;
                    idx[1]=j;
                    q.add(idx);
                }
            }
        }
        int minutes=0;
        while(q.isEmpty()==false && fresh>0){
            int size=q.size();
            minutes++;
            for(int i=0;i<size;i++){
                int[] idd=q.poll();
                int row=idd[0],col=idd[1];
                if(row-1>=0 && grid[row-1][col]==1){
                    grid[row-1][col]=2;
                    int[] id=new int[2];
                    id[0]=row-1;
                    id[1]=col;
                    q.add(id);
                    fresh--;
                   // System.out.println("up");
                }
                if(row+1<grid.length && grid[row+1][col]==1){
                    int[] id=new int[2];
                    grid[row+1][col]=2;
                    id[0]=row+1;
                    id[1]=col;
                    q.add(id);
                    fresh--;
                   // System.out.println("down");
                }
                if(col-1>=0 && grid[row][col-1]==1){
                    int[] id=new int[2];
                    grid[row][col-1]=2;
                    id[0]=row;
                    id[1]=col-1;
                    q.add(id);
                    fresh--;
                    //System.out.println("left");
                }
                if(col+1<grid[0].length && grid[row][col+1]==1){
                    int[] id=new int[2];
                    grid[row][col+1]=2;
                    id[0]=row;
                    id[1]=col+1;
                    q.add(id);
                    fresh--;
                    //System.out.println("right");
                }
            }
        }
        System.out.println(fresh+" "+minutes);
        return fresh==0?minutes:-1;
    }
}