class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int r=0,c=0;
        for(String s:commands){
            if(s.charAt(0)=='R') {
                c++;
            }
            else if(s.charAt(0)=='L')c--;
            else if(s.charAt(0)=='D')r++;
            else r--;
        }
        return r*n+c;
    }
}