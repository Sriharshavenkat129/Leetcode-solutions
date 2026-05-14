class Solution {
    public boolean isGood(int[] nums) {
        int [] arr=new int[200];
        boolean met=false;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(nums[i]>nums.length-1) return false;
            if(arr[nums[i]]==2 && nums[i]==nums.length-1)met=true;
            if(arr[nums[i]]==2 && nums[i]!=nums.length-1) return false;
            if(arr[nums[i]]>2) return false;
        }
        return met;
    }
}