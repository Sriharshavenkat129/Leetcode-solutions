class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n,even=n*(n+1);
        for(int i=odd;i>=2;i--){
            if(even%i==0 && odd%i==0)return i;
        }
        return 1;
    }
}