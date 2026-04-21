class Solution {
    public int countAsterisks(String s) {
        boolean safemode=false;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(safemode==false && ch=='*')ans++;
            else if(ch=='|') safemode=!safemode;
        }
        return ans;
    }
}