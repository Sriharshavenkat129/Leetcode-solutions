class Solution {
    public long countCommas(long n) {
        if(n<=999)return 0;
        long ans=0;
        long div=1000;
        int i=1;
        while(n>=div){
            long r=n%div;
            ans=ans+(n-div);
            i++;
            div*=1000;
            ans++;
        }
        return ans;
    }
}