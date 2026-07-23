class Solution {
    public int findShortestSubArray(int[] nums) {
        int maxVal = 0;
        for (int x : nums) {
            maxVal = Math.max(maxVal, x);
        }
        int[] count = new int[maxVal + 1];
        int[] first = new int[maxVal + 1];
        int[] last = new int[maxVal + 1];
        for (int i = 0; i <= maxVal; i++) {
            first[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (first[x] == -1) {
                first[x] = i;
            }

            last[x] = i;
            count[x]++;
        }
        int degree = 0;
        for (int x : nums) {
            degree = Math.max(degree, count[x]);
        }
        int result = nums.length;
        for (int x : nums) {
            if (count[x] == degree) {
                result = Math.min(result, last[x] - first[x] + 1);
            }
        }
        return result;
    }
}