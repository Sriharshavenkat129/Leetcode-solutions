class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long totalSum=0;
        int [] horsum=new int[grid.length];
        int[] versum=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                totalSum+=grid[i][j];
                horsum[i]+=grid[i][j];
                versum[j]+=grid[i][j];
            }
        }
        if(totalSum%2!=0) return false;
        //System.out.println(Arrays.toString(horsum));
        //System.out.println(Arrays.toString(versum));
        //System.out.println(totalSum);
        long sum=0;
        for(int n:horsum){
            sum+=n;
            if(sum==totalSum/2) return true;
            if(sum>totalSum/2) break;
        }
        sum=0;
        for(int n:versum){
            sum+=n;
            if(sum==totalSum/2) return true;
            if(sum>totalSum/2) break;
        }
        return false;
    }
}