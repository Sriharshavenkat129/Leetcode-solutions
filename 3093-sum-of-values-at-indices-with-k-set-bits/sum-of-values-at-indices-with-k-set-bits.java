class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            if(isValid(i,k))ans+=nums.get(i);
        }
        return ans;
    }
    public static boolean isValid(int n,int k){
        int num=0;
        while(n!=0){
           if(n%2==1)
            num++;
            n/=2;
        }
        return k==num;
    }
}