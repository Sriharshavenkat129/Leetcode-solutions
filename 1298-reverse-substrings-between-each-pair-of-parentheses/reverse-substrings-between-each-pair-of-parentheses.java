class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        char[] arr=s.toCharArray();
        for(char ch:arr){
            if(ch!=')')
                stack.push(ch);
            else{
                while(stack.peek()!='('){
                    queue.offer(stack.pop());
                }
                stack.pop();
                while(queue.isEmpty()==false){
                    stack.push(queue.poll());
                }
            }
        }
        StringBuilder ans=new StringBuilder("");
        while(stack.isEmpty()==false)ans.append(stack.pop());
        return ans.reverse().toString();
    }
}