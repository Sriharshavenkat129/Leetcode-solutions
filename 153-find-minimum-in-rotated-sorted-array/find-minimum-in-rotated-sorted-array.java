class Solution {
    public int findMin(int[] nums) {
        int pivot=findpivot(nums,0,nums.length-1);
        if(nums[0]<nums[nums.length-1])
        return nums[0];
        else
        return nums[pivot+1];
    }
    static int findpivot(int []nums,int start,int end){
        while(start<end){
            int mid=(start+end)/2;
            if(start<mid && nums[mid]<nums[mid-1])
            return mid-1;
            if(end>mid && nums[mid]>nums[mid+1])
            return mid;
            if(nums[mid]<nums[start])
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }
}