class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L')l++;
            else if(ch=='R')r++;
        }
        int alt=moves.length()-r-l;
        return alt+Math.abs(r-l);
    }
}