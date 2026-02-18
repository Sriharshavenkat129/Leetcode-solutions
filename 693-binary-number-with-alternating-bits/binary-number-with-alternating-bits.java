class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n==0)return false;
        int pre=n%2;
        n=n/2;
        while(n!=0){
            if(n%2==pre) return false;
            pre=n%2;
            n/=2;
        }
        return true;
    }
}