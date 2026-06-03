class Solution {
    public String countAndSay(int n) {
        StringBuilder str=new StringBuilder("1");
        if(n==1)return "1";
        for(int i=1;i<n;i++){
            char cur=str.charAt(0);
            int count=1;
            StringBuilder newstr=new StringBuilder("");
            for(int j=1;j<str.length();j++){
                if(str.charAt(j)==cur) count++;
                else{
                    newstr.append(count+""+cur);
                    count=1;
                    cur=str.charAt(j);
                }
            }
            newstr.append(count+""+cur);
            str=newstr;
        }
        return str.toString();
}
}