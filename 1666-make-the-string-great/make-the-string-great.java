class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(stack.isEmpty())stack.push(ch);
            else{
                if(ch>='A' && ch<='Z'){
                    if(stack.peek()==(char)(ch+32)){
                        stack.pop();
                    }
                    else stack.push(ch);
                }
                else{
                    if(stack.peek()==(char)(ch-32))stack.pop();
                    else stack.push(ch);
                }
            }
        }
        StringBuilder ans=new StringBuilder("");
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}