class Solution {
    public String digitSum(String s, int k) {
        StringBuilder str=new StringBuilder(s);
        while(str.length()>k){
            int l=0,sum=0;
            StringBuilder newstr=new StringBuilder("");
            for(int i=0;i<str.length();i++){
                l++;
                sum=sum+(str.charAt(i)-'0');
                System.out.println(sum);
                if(l%k==0){
                    newstr.append(sum);
                    sum=0;
                }
            }
            if(l%k!=0){
                newstr.append(sum);
            }
            str=newstr;
        }
        return str.toString();
    }
}