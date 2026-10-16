class Solution {
    public int sumCounts(List<Integer> nums) {
        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        int ans=0;
        for(int n:nums){
            HashSet<Integer> set=new HashSet<>();
            set.add(n);
            list.add(set);
            int size=list.size();
            for(int i=0;i<size;i++){
                list.get(i).add(n);
                ans+=Math.pow(list.get(i).size(),2);
            }
        }
        return ans;
    }
}