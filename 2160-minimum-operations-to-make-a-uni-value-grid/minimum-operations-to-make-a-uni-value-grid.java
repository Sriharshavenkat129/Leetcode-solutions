class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> l=new ArrayList<>();
        int r=grid[0][0]%x;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]%x!=r) return -1;
                else l.add(grid[i][j]);
            }
        }
        Collections.sort(l);
        int ans=0;
        int t=l.get(l.size()/2);
        for(int num:l){
            ans+=Math.abs(num-t)/x;
        }
        return ans;
    }
}