class Solution {
    public int bitwiseComplement(int n) {
        int ans=0;
        int pow=0;
        if(n==0) return 1;
        while(n!=0){
            if(n%2==0){
                ans+=Math.pow(2,pow);
            }
            n/=2;
            pow++;
        }
        return ans;
    }
}