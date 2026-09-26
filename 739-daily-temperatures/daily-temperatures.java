class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int index=temperatures.length-1;
        int[] ans=new int[index+1];
        while(index>=0){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[index]){
                stack.pop();
            }
            if(!stack.isEmpty())ans[index]=stack.peek()-index;
            else ans[index]=0;
            stack.push(index);
            index--;
        }
        return ans;
    }
}