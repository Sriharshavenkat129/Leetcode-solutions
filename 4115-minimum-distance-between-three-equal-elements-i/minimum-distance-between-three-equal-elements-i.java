class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> l=map.getOrDefault(nums[i],new ArrayList<>());
            l.add(i);
            if(l.size()>=3){
                found=true;
                ans=Math.min(ans,getMin(l));
            }
            map.put(nums[i],l);
        }
        return found?ans:-1;
    }
    public static int getMin(ArrayList<Integer> l){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<l.size()-2;i++){
            for(int j=i+1;j<l.size()-1;j++){
                for(int k=j+1;k<l.size();k++){
                    int avg=Math.abs(l.get(i)-l.get(j))+Math.abs(l.get(j)-l.get(k))+Math.abs(l.get(k)-l.get(i));
                    ans=Math.min(avg,ans);
                }
            }
        }
        return ans;
    }
}