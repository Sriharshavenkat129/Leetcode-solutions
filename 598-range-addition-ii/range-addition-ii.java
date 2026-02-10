class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)return m*n;
      //  if(ops.length==1)return ops[0][0]*ops[1][1];
        int rmin=10000000;
        int cmin=10000000;
        for(int i=0;i<ops.length;i++){
              rmin=Math.min(rmin,ops[i][0]);
              cmin=Math.min(cmin,ops[i][1]);
        }
        return rmin*cmin;
    }
}