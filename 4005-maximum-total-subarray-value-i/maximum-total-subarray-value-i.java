class Solution {
    public long maxTotalValue(int[] nums, int k) {
       int max=-1,min=Integer.MAX_VALUE;
       for(int num:nums){
        max=Math.max(num,max);
        min=Math.min(num,min);
       } 
      // System.out.println(max-min);
       long diff=max-min;
       // System.out.println(k*diff);
       return diff*k;
    }
}