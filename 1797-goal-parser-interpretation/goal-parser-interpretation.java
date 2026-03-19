class Solution {
    public String interpret(String command) {
        String ans="";
        int isit=0;
        for(char ch:command.toCharArray()){
            if(ch=='('){
                isit=1;
            }
            else if(isit==1){
                if(ch==')') ans+="o";
                else ans+=ch;
                isit=0;
            }
            else if(isit==0 && ch==')')
            isit=0;
            else{
                ans+=ch;
            }
        }
        return ans;
    }
}