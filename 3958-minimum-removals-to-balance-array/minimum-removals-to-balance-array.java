class Solution {
    public int minRemoval(int[] nums, int k) {
           Arrays.sort(nums);
           if(nums.length==1)
           return 0;
           if(nums.length==2 && nums[0]*k>=nums[1])
           return 0;
           int start=0;
           int end=1;
           int ans=nums.length;
           while(start<=end && end<nums.length){
           // System.out.println(start+"  "+end);
            if((long)nums[start]*k>=nums[end]){
                end++;
            }
            else{
                System.out.println(nums[start]*k+" "+nums[end]);
                System.out.println("break");
                System.out.println(start+""+end);
                ans=Math.min(ans,nums.length-end+(start));
                start++;
            }
           }
            ans=Math.min(ans,nums.length-end+(start));
            if(start==0 && end==nums.length)
            return 0;
/*
        int ans=1000000000;
        int right=0;
           for(int i=0;i<nums.length-1;i++){
            while(right<nums.length && (long)nums[i]*k>=nums[right]){
                right++;
            }
            ans=Math.min(ans,nums.length-(right-i));
        }
        */
           return ans;
           
    }
}