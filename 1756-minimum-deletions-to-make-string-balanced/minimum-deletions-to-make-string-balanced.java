class Solution {
    public int minimumDeletions(String s) {
      int ans=0;
      Stack<Character> stack=new Stack<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(!stack.isEmpty() && c=='a'){
                ans++;
                stack.pop();
        }
        else if(c=='b'){
            stack.push(c);
        }
      }
      return ans;
      }
}