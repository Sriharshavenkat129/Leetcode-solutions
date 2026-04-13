class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int totalused=0;
        while(totalused<nums.length){
            HashSet<Integer> set=new HashSet<>();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(!set.contains(nums[i]) && nums[i]!=-1){
                    l.add(nums[i]);
                    set.add(nums[i]);
                    nums[i]=-1;
                    totalused++;
                }
            }
            ans.add(l);
        }
        return ans;
    }
}