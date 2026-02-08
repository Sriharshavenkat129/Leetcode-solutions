class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:nums){
            //System.out.println(map.get(i));
            if(map.getOrDefault(i+1,0)>0)
            ans=Math.max(ans,map.getOrDefault(i+1,0)+map.get(i));
        }
        return ans;
    }
}