class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int start=0,end=nums.length-1;
            while(start<i && end>i){
                if(nums[end]-nums[i]==diff && nums[i]-nums[start]==diff){
                    ans++;
                    break;
                }
                if(nums[end]-nums[i]>diff){
                    end--;
                }
                if(nums[i]-nums[start]>diff){
                    start++;
                }
                if(nums[end]-nums[i]<diff || nums[i]-nums[start]<diff) break;
            }
        }
        return ans;
    }
}