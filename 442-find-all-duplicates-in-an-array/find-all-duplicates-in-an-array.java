class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int [] counts=new int[nums.length+1];
        for(int n:nums)counts[n]++;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(counts[i]==2)l.add(i);
        }
        return l;
    }
}