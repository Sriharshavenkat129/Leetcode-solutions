class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] res=new int[nums.length];
        /*
        int count=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot)count++;
            else if(nums[i]<pivot){
                res[left]=nums[i];
                left++;
                nums[i]=Integer.MIN_VALUE;
            }
        }
        for(int i=0;i<count;i++){
            res[left]=pivot;
            left++;
        }
        System.out.println(left);
        for(int num:nums){
            if(num>pivot){
                res[left]=num;
                left++;
            }
        }
        */
        int left=0,right=nums.length-1;
        int i=0,j=nums.length-1;
        while(i<nums.length && j>=0){
            if(nums[i]<pivot){
                res[left]=nums[i];
                left++;
                }
            if(nums[j]>pivot){
                res[right]=nums[j];
                right--;
            }
            i++;
            j--;
        }
        while(left<=right){
            res[left]=pivot;
            left++;
        }
        return res;
    }
}