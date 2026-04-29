class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor^=nums[i];
        }
        int ans=0;
        int max=Math.max(xor,k);
        while(max!=0){
            if(xor%2!=k%2) ans++;
            xor/=2;
            k/=2;
            max/=2;
        }
        return ans;
    }
}