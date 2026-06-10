class Solution {
    public String capitalizeTitle(String title) {
        String ans="";
        String[] words=title.split(" ");
        for(int i=0;i<words.length;i++){
            ans+=change(words[i]);
            if(i<words.length-1) ans+=" ";
        }
        return ans;
    }
    public static String change(String title){
         StringBuilder ans=new StringBuilder("");
        if(title.length()<=2){
            for(int i=0;i<title.length();i++){
                if(title.charAt(i)>='A' && title.charAt(i)<='Z'){
                    ans.append((char)(title.charAt(i)+32));
                }else ans.append(title.charAt(i));
            }
        }
        else{
            if(title.charAt(0)>='a' && title.charAt(0)<='z'){
                ans.append((char)(title.charAt(0)-32));
            }
            else ans.append(title.charAt(0));
            for(int i=1;i<title.length();i++){
                char ch=title.charAt(i);
                if(ch>='A' && ch<='Z')ch=(char)(ch+32);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}