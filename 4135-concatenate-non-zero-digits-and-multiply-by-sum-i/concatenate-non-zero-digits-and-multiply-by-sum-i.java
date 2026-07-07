class Solution {
    public long sumAndMultiply(int n) {
        long mul=0;
        long sum=0;
        String arr=String.valueOf(n);
        for(char ch:arr.toCharArray()){
            int r=ch-'0';
            if(r!=0){
                mul+=r;
                sum=sum*10+r;
            }
        }
        return sum*mul;
    }
}