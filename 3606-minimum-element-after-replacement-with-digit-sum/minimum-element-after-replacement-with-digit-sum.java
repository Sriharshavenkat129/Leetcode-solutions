class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int num:nums){
            int addnum=0;
            while(num!=0){
                addnum+=num%10;
                num/=10;
            }
            ans=Math.min(ans,addnum);
        }
        return ans;
    }
}