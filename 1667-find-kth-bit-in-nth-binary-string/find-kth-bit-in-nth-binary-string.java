class Solution {
    public char findKthBit(int n, int k) {
        if(n==1) return '0';
        StringBuilder s=new StringBuilder("0");
        while(s.length()<=k){
            String ir=getInverseReverse(s);
            s.append('1');
            s.append(ir);
        }
        return s.charAt(k-1);
    }
    public static String getInverseReverse(StringBuilder s){
        StringBuilder ss=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0')ss.append('1');
            else ss.append('0');
        }
        return ss.toString();
    }
}