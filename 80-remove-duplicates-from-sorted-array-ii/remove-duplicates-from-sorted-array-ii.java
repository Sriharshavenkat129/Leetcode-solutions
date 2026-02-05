class Solution {
    public int removeDuplicates(int[] nums) {
       int k=1;
       int repeated=0;
       int pre=nums[0];
       for(int i=1;i<nums.length;i++){
        if(pre!=nums[i]){
        nums[k]=nums[i];
        repeated=0;
        pre=nums[i];
        k++;
        }
        else if(pre==nums[i] && repeated==0){
            nums[k]=nums[i];
            repeated=1;
            k++;
        }
       }
       return k;
    }
}