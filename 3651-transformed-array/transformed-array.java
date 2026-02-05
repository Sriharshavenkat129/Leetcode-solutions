class Solution {
    public int[] constructTransformedArray(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int[] result=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
           int step=0;
           if(nums[i]>=0){
            step=nums[i]%n+i;
                if(step>n-1){
                step=step%n;
                }
            result[i]=nums[step];
           }
           else{
            step=Math.abs(nums[i])%n;
            int newstep=i;
            for(int j=1;j<=step;j++){
                newstep--;
                if(newstep<0){
                    newstep=n-1;
                }
            }
            result[i]=nums[newstep];
           }

        }
        return result;
    }
}