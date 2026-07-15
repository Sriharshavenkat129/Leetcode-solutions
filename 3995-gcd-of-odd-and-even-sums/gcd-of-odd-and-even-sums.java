class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0,even=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0)even+=i;
            else odd+=i;
        }
        for(int i=odd;i>=2;i--){
            if(even%i==0 && odd%i==0)return i;
        }
        return 1;
    }
}