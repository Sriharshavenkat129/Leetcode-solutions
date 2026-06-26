class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String str:tokens){
            char ch=str.charAt(0);
            if(str.length()==1 && (ch=='+'||ch=='-'||ch=='*'||ch=='/')){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(calculate(a,b,ch));
            }
            else{
                stack.push(Integer.valueOf(str));
            }
           // System.out.println(stack.toString());
        }
        return stack.pop();
    }
    public static int calculate(int a,int b,char ch){
        int ans=0;
        switch(ch){
            case '+'->ans= a+b;
            case '-'->ans=a-b;
            case '/'->ans= a/b;
            case '*'->ans= a*b;
        }
        return ans;
    }
}