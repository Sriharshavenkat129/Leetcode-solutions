class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue=new LinkedList<>();
    }
    
    public void push(int x) {
        int size=queue.size();
        queue.add(x);
        for(int i=0;i<size;i++){
            queue.add(queue.poll());
        }
    }
    
    public int pop() {
        if(queue.size()==0)return -1;
        return queue.poll();
    }
    
    public int top() {
     return queue.size()==0?-1:queue.peek();   
    }
    
    public boolean empty() {
        return queue.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */