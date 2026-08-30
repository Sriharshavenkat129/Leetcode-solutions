class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=2)return nums.length;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int minIndex=-1,maxIndex=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(num>max){
                max=num;
                maxIndex=i;
            }
            if(min>num){
                min=num;
                minIndex=i;
            }
        }
        int ans=Math.max(minIndex,maxIndex)+1;
        ans=Math.min(ans,n-Math.min(maxIndex,minIndex));
        int diff=Math.abs(maxIndex-minIndex)-1;
        return Math.min(ans,n-diff);
    }
}