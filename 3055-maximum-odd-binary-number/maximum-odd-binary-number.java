class Solution {
    public String maximumOddBinaryNumber(String s) {
        int onesCount=0,zerosCount=0;
        for(char ch:s.toCharArray()){
            if(ch=='1')onesCount++;
            else zerosCount++;
        }
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<onesCount-1;i++){
            ans.append("1");
        }
        for(int i=0;i<zerosCount;i++) ans.append("0");
        return ans.toString()+'1';
    }
}