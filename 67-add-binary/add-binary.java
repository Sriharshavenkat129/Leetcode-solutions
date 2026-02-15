class Solution {
    public String addBinary(String aa, String bb) {
        StringBuilder ans=new StringBuilder("");
        if(aa.length()==0) return bb;
        if(bb.length()==0) return aa;
        int carry=0;
        int max_length=Math.max(aa.length(),bb.length());
        int i=0;
        while(i<max_length){
            char a='0',b='0';
            if(aa.length()>i) a=aa.charAt(aa.length()-i-1);
            if(bb.length()>i) b=bb.charAt(bb.length()-i-1);
            if(a=='1' && b=='1'){
                if(carry==1){
                    ans.append("1");
                    carry=1;
                }
                else{
                    ans.append("0");
                    carry=1;
                }
            }
            else if(a=='1' || b=='1'){
                if(carry==1){
                    ans.append("0");
                    carry=1;
                }
                else {
                    ans.append("1");
                    carry=0;
                }
            }
            else{
                if(carry==1){
                    ans.append("1");
                    carry=0;
                }
                else{
                    ans.append("0");
                    carry=0;
                }
            }
            i++;
        }
        if(carry==1) ans.append("1");
        return ans.reverse().toString();
    }
}