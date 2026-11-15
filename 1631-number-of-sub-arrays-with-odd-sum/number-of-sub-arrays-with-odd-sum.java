class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1_000_000_007;
        int oddCount=0,evenCount=1;
        int sum=0;
        int ans=0;
        for(int n:arr){
            sum+=n;
            if(sum%2==0){
                ans=(ans+oddCount)%mod;
                evenCount++;
            }
            else{
                ans=(ans+evenCount)%mod;
                oddCount++;
            }
        }   
        return (int)ans;
    }
}