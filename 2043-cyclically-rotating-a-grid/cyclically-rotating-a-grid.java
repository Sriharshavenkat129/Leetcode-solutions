class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int mid=Math.min(grid.length,grid[0].length)/2;
        for(int i=0;i<mid;i++){
            rotate(grid,i,k);
        }
        return grid;
    }
    public static void rotate(int[][] grid,int start,int k){
        int upperbound=start,leftbound=start,rightbound=grid[0].length-1-start,bottombound=grid.length-1-start;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=start;i<=rightbound;i++){
            l.add(grid[start][i]);
        }
        for(int i=start+1;i<=bottombound;i++){
            l.add(grid[i][rightbound]);
        }
        for(int i=rightbound-1;i>=leftbound;i--){
            l.add(grid[bottombound][i]);
        }
        for(int i=bottombound-1;i>upperbound;i--){
            l.add(grid[i][start]);
        }
        //rotating values
        k=k%l.size();
        for(int i=0;i<k;i++){
            int t=l.get(0);
            l.remove(0);
            l.add(t);
        }
        modify(grid,l,start);
       // System.out.println(l.toString());
    }
    public static void modify(int[][] grid,ArrayList<Integer> l,int start){
        int index=0;
        int upperbound=start,leftbound=start,rightbound=grid[0].length-1-start,bottombound=grid.length-1-start;
        for(int i=start;i<=rightbound;i++){
            grid[start][i]=l.get(index);
            index++;
        }
        for(int i=start+1;i<=bottombound;i++){
            grid[i][rightbound]=l.get(index);
            index++;
        }
        for(int i=rightbound-1;i>=leftbound;i--){
            grid[bottombound][i]=l.get(index);
            index++;
        }
        for(int i=bottombound-1;i>upperbound;i--){
            grid[i][start]=l.get(index);
            index++;
        }
    }
}