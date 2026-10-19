class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans= new ArrayList<>();
        int count=0,index=0;
        for(int n:nums){
            if(n<target)index++;
            else if(n==target)count++;
        }
        for(int i=0;i<count;i++){
            ans.add(index);
            index++;
        }
        return ans;
    }
}