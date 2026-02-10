class Solution {
    public int longestBalanced(int[] nums) {
        int ans=0;
        HashSet<Integer> evens=new HashSet<>();
        HashSet<Integer> odds=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0)evens.add(nums[j]);
                else odds.add(nums[j]);
                if(evens.size()==odds.size())ans=Math.max(j-i,ans);
            }
            evens.clear();
            odds.clear();
        }
        return ans==0?0:ans+1;
    }
}