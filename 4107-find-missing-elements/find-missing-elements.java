class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0],max=nums[0];
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int n:nums){
            max=Math.max(n,max);
            set.add(n);
            min=Math.min(n,min);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i))ans.add(i);
        }
        return ans;
    }
}