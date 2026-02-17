class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int []ans=new int[2];
        for(int i=0;i<nums.length;i++){
            while(i!=nums[i]){
                int temp=nums[i];
                if(temp==nums[nums[i]]){
                    break;
                }
                nums[i]=nums[nums[i]];
                nums[temp]=temp;
            }
        }
        ans[0]=nums[nums.length-1];
        ans[1]=nums[nums.length-2];
        return ans;
    }
}