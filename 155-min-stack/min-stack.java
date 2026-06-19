class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> minStack;
    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int value) {
        if(minStack.isEmpty()){
            minStack.push(value);
        }
        else{
            if(value<=minStack.peek()){
                minStack.push(value);
            }
        }
            stack.push(value);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            if(stack.peek().equals(minStack.peek())){
                minStack.pop();
            }
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