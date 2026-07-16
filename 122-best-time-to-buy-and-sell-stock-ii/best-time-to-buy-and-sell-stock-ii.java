class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        if(prices.length<=1)return 0;
        int buy=prices[0];
        for(int n:prices){
            if(buy<n){
                ans=ans+n-buy;
                buy=n;
            }
            else buy=n;
        }
        return ans;
    }
}