class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c1=0,c2=0,ans=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n==1)c1++;
            else c2++;
            if(c1==c2)ans=i+1;
            else if(map.containsKey(c1-c2))ans=Math.max(ans,i-map.get(c1-c2));
            if(map.containsKey(c1-c2)==false)map.put(c1-c2,i);

        }
        return ans;
    }
}