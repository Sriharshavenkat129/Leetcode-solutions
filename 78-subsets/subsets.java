class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        ans.add(l);
        findSubsets(nums,0,ans);
        return ans;
    }
    public void findSubsets(int []nums,int index,List<List<Integer>>ans){
        if(index==nums.length)
        return;
        int n=ans.size();
        for(int i=0;i<n;i++){
            List<Integer> newlist=new ArrayList<>(ans.get(i));
            newlist.add(nums[index]);
            ans.add(newlist);
        }
        findSubsets(nums,index+1,ans);
    }
}