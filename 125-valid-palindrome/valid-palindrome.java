class Solution {
    public boolean isPalindrome(String s) {
        /*
        int start=0,end=s.length()-1;
        while(start<end){
            char ch1=s.charAt(start);
            char ch2=s.charAt(end);
            if(ch1>='A' && ch1<='Z')
                ch1=(char)(ch1+32);
            if(ch2>='A' && ch2<='Z')
                ch2=(char)(ch2+32);
            if(ch1<97 || ch1>122)
                start++;
            else if(ch2<97 || ch2>122)
                end--;
            else if(ch1!=ch2) return false;
            else{
                start++;
                end--;
            }
        }
        return true;
        */
        s=s.toLowerCase();
        StringBuilder ss=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z' )|| (s.charAt(i)>='0' && s.charAt(i)<='9'))
            ss.append(s.charAt(i));
        }
        int start=0,end=ss.length()-1;
        while(start<end){
            if(ss.charAt(start)!=ss.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}