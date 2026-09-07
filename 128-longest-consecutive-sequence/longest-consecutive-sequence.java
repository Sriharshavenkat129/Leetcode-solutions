class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)set.add(n);
        int ans=0;
        for(int n:set){
            if(set.contains(n-1))continue;
            int count=0;
            for(int i=n;set.contains(i);i++){
                count++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}