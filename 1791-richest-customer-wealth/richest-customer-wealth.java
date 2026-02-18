class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int i=0;i<accounts.length;i++){
            int amount=0;
            for(int j=0;j<accounts[i].length;j++){
                amount+=accounts[i][j];
            }
            ans=Math.max(amount,ans);
        }
        return ans;
    }
}