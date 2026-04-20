class Solution {
    public int maxDistance(int[] colors) {
        if(colors[0]!=colors[colors.length-1]) return colors.length-1;
        int i=0;
        while(i<colors.length && colors[i]==colors[colors.length-1]){
            i++;
        }
        int ans=Math.abs(colors.length-1-i);
        i=colors.length-1;
        while(i>0 && colors[i]==colors[0]){
            i--;
        }
        ans=Math.max(ans,i);
        return ans;
    }
}