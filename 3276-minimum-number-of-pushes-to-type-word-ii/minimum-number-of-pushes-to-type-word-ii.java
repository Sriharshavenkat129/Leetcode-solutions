class Solution {
    public int minimumPushes(String word) {
        int[] counts = new int[26];
        for (char ch : word.toCharArray()) {
            counts[ch - 'a']++;
        }
        int ans = 0;
        int pad = 0;
        while (true) {
            int max = 0, maxIndex = -1;
            for (int i = 0; i < 26; i++) {
                if (max < counts[i]) {
                    max = counts[i];
                    maxIndex = i;
                }
            }
                if (maxIndex == -1)
                    break;
                else {
                    int step = pad / 8 + 1;
                    counts[maxIndex] = 0;
                    ans = ans + max * step;
                    pad++;
                }
        }
        return ans;
    }
}