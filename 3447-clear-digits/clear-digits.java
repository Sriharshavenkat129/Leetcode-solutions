class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && ch>='0' && ch<='9')stack.pop();
            else if(ch>='a' && ch<='z') stack.push(ch);
        }
        StringBuilder ans=new StringBuilder("");
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}