class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0,end=nums.length-1;
        int ans[]=new int[nums.length];
        int index=nums.length-1;
        while(start<=end){
            int n1=Math.abs(nums[start]);
            int n2=Math.abs(nums[end]);
            if(n1>=n2){
                ans[index]=n1*n1;
                start++;
            }
            else{
                ans[index]=n2*n2;
                end--;
            }
            index--;
        }
        return ans;
    }
}