class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallOdd=-1,smallEven=-1;
        for(int n:nums1){
            if(n%2==0){
                smallEven=smallEven==-1?n:Math.min(smallEven,n);
            }
            else{
                smallOdd=smallOdd==-1?n:Math.min(smallOdd,n);
            }
        }
        if(smallOdd==-1 || smallEven==-1)return true;
        if(smallOdd<smallEven)return true;
        return false;
    }
}