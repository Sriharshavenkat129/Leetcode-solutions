class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])==0)map.remove(nums[left]);
                left++;
            }
            if(map.get(nums[right])<=k)ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}