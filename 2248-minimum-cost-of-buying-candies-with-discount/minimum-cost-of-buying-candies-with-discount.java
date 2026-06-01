class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        int end=cost.length-1;
        while(end>=0){
            ans+=cost[end];
            end--;
            if(end>=0)ans+=cost[end];
            end-=2;
        }
        return ans;
    }
}