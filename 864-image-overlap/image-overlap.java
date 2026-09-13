class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans=0;
        ArrayList<int[]> l1=new ArrayList<>();
        ArrayList<int[]> l2=new ArrayList<>();
        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img1.length;j++){
                if(img1[i][j]==1)l1.add(new int[]{i,j});
                if(img2[i][j]==1)l2.add(new int[]{i,j});
            }
        }
        int [][] counts=new int[2*img1.length+1][2*img1.length+1];
        for(int[] arr1:l1){
            for(int [] arr2:l2){
                int r=arr2[0]-arr1[0]+img1.length;
                int c=arr2[1]-arr1[1]+img1.length;
                counts[r][c]++;
                ans=Math.max(ans,counts[r][c]);
            }
        }
        return ans;
    }
}