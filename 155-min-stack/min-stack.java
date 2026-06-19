class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> minStack;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(value);
            minStack.push(value);
            min=value;
        }
        else{
            stack.push(value);
            if(value<=min){
                min=value;
            }
            minStack.push(min);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            minStack.pop();
            min=minStack.isEmpty()?Integer.MAX_VALUE:minStack.peek();
            stack.pop();
        }
    }
    
    public int top() {
        if(stack.isEmpty()==false) return stack.peek();
        return -1;
    }
    
    public int getMin() {
        if(minStack.isEmpty()==false)return minStack.peek();
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */