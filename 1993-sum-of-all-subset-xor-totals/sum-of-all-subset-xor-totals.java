class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=0;i<nums.length;i++){
            int n=list.size();
            for(int j=0;j<n;j++){
                list.add(list.get(j)^nums[i]);
            }
        }
        int ans=0;
        for(int num:list)ans+=num;
        return ans;
    }
}