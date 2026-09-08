class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0;
        int current_sum=0;
        for(int i=0;i<nums.length;i++){
            current_sum+=nums[i];
            int r=current_sum-k;
            if(map.containsKey(r)){
                ans+=map.get(r);
            }
            map.put(current_sum,map.getOrDefault(current_sum,0)+1);
        }
        return ans;
    }
}