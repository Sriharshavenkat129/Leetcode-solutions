class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            boolean isValid=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr2[j]-arr1[i])<=d){
                    isValid=false;
                    break;
                }
            }
            if(isValid)ans++;
        }
        return ans;
    }
}