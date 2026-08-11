class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int pre=nums[0];
        int sum=nums[0];
        if(nums.length==1)return sum+1;
        set.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(pre!=-1 && nums[i]-1==pre){
                pre=nums[i];
                sum+=nums[i];
            }
            else pre=-1;
            set.add(nums[i]);
        }
        for(sum=sum;set.contains(sum);sum++){}
        return sum;
    }
}