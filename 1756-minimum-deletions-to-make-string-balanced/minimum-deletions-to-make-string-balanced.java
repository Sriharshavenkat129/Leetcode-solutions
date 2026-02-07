class Solution {
    public int minimumDeletions(String s) {
        /*
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
      */
      int deletions=0;
      int bcount=0;
      for(char c:s.toCharArray()){
        if(c=='b')bcount++;
        else deletions=Math.min(deletions+1,bcount);
      }
      return deletions;
}
}