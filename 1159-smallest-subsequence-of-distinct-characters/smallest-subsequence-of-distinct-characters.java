class Solution {
    public String smallestSubsequence(String s) {
        int[]freqs=new int[26];
        for(char ch:s.toCharArray()){
            freqs[ch-'a']++;
        }
        int[] used=new int[26];
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           // System.out.println(stack.toString());
            while (!stack.isEmpty() &&used[ch-'a']==0 && stack.peek()>ch && freqs[stack.peek()-'a']>0){
                used[stack.peek()-'a']--;
                stack.pop();
            }
            if(used[ch-'a']<1){
                stack.push(ch);
                used[ch-'a']++;
            }
            freqs[ch-'a']--;
        }
       // System.out.println(stack.toString());
       StringBuilder ans=new StringBuilder("");
       while(!stack.isEmpty()){
        ans.append(stack.pop());
       }
        return ans.reverse().toString();
    }
}