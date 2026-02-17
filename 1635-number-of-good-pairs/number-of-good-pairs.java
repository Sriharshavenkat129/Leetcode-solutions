class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        for(int count:map.values()){
            if(count>1)ans+=count*(count-1)/2;
        }
        return ans;
    }
}