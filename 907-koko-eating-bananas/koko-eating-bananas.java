class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=piles[0];
        for(int i:piles){
            right=Math.max(i,right);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int hours=getHours(piles,mid);
            if(hours<=h)right=mid;
            else left=mid+1;
        }
        return left;
    }
    public int getHours(int[] piles,int k){
        int hours=0;
        for(int n:piles){
            hours+=(int)Math.ceil((double)n/k);
        }
        return hours;
    }
}