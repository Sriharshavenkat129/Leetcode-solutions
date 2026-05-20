class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int ans[]=new int[2];
        int count=0;
        for(char ch:s.toCharArray()){
            if(widths[ch-'a']+count>100){
                ans[0]++;
                count=0;
            }
            count+=widths[ch-'a'];
        }
        ans[0]++;
        ans[1]=count;
        return ans;
    }
}