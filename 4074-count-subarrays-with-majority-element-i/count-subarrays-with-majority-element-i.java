class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(nums[i]==target){
                count++;
                ans++;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target)count++;
                int size=(j-i)+1;
                //System.out.println(size);
                if(2*count>size){
                    ans++;
                    //System.out.println("entered!");
                }
            }
        }
        return ans;
    }
}