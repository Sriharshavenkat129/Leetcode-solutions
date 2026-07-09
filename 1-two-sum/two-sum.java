class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int r=target-nums[i];
            if(map.containsKey(r)){
                ans=new int[]{map.get(r),i};
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}