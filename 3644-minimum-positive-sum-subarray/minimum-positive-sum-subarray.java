class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = -1;
        for(int i=l;i<=r;i++){
        int sum = 0;
        int pre = 0;
        for (int j = 0; j < i; j++) {
            sum += nums.get(j);
        }
        if(sum>0){
            if(ans==-1)ans=sum;
            else ans=Math.min(ans,sum);
        }
        for (int k = i; k < nums.size(); k++) {
            sum += nums.get(k);
            sum -= nums.get(pre);
            pre++;
            if (sum > 0) {
                if (ans == -1)
                    ans = sum;
                else
                    ans = Math.min(ans, sum);
            }
        }
        }
        return ans;
    }
}