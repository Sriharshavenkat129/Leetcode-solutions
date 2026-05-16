class Solution {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<end && nums[start]>=nums[end])start++;
        /*while(start<end){
            int mid=(start+end)/2;
            if(nums[start]==nums[start+1])start++;
            else if(nums[end]==nums[end-1])end--;
            else if(nums[end]==nums[start])start++;
            else if(start<mid && nums[mid]<nums[mid-1])return nums[mid];
            else if(mid<end && nums[mid]>nums[mid+1])return nums[mid+1];
            else if(nums[start]>nums[mid])start=mid+1;
            else end=mid;
        }
        */
        return nums[start];
    }
}