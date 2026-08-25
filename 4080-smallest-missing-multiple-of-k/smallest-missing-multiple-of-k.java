class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)set.add(i);
        int add=k;
        while(set.contains(k))k+=add;
        return k;
    }
}