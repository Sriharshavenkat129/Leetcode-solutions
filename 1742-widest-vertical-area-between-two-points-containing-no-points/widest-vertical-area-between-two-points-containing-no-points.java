class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int m = points.length;
        int ans[] = new int [m];
        for(int i = 0; i < m; i++) {
            ans[i] = points[i][0];
        }
        Arrays.sort(ans);
        int count = 0;
        for(int i = 1; i<ans.length; i++){
            count = Math.max(count,ans[i]-ans[i-1]);
        }
        return count;
    }
}
