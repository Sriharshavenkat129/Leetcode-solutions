class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder("");
        Stack <Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(stack.isEmpty()==false && stack.peek()==ch) stack.pop();
            else stack.push(ch);
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}