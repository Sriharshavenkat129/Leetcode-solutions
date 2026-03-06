class Solution {
    public boolean checkOnesSegment(String s) {
        int ones=0,zeros=0;
        for(char ch:s.toCharArray()){
            if(ones==1 && zeros>0 && ch=='1')return false;
            if(ch=='1' && ones==0) ones++;
            else if(ones==1 && ch=='0') zeros++;
        }
        return true;
    }
}