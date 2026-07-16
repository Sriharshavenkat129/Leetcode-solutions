class Solution {
    public long gcdSum(int[] nums) {
        int pre[]=new int[nums.length];
        pre[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            pre[i]=gcd(nums[i],max);
        }
        long ans=0;
        Arrays.sort(pre);
        int start=0,end=pre.length-1;
        while(start<end){
            ans+=gcd(pre[start],pre[end]);
            start++;
            end--;
        }
        return ans;
    }
    public static int gcd(int n1,int n2){
        if(n1==n2)return n1;
        if(n1<n2){
            while(n2!=0){
                int temp=n2;
                n2=n1%n2;
                n1=temp;
            }
            return n1;
        }
        while(n1!=0){
            int temp=n1;
            n1=n2%n1;
            n2=temp;
        }
        return n2;
    }
}