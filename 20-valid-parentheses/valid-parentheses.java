class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            else{
                if(stack.isEmpty())return false;
                char p=stack.pop();
                if(map.get(ch)!=p)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}