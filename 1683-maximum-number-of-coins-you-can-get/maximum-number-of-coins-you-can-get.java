class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans=0;
        int bob=0,me=piles.length-2;
        while(bob<me){
            ans+=piles[me];
            me-=2;
            bob++;
        }
        return ans;
    }
}