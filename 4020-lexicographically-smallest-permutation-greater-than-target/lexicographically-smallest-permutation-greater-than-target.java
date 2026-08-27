class Solution {
    public String lexGreaterPermutation(String s, String target) {
        Stack<Character> stack=new Stack<>();
        char[] arr1=s.toCharArray();
        char[] arr2=target.toCharArray();
        int [] counts=new int[26];
        for(char ch:arr1)counts[ch-'a']++;
        boolean isFound=false;
        int index=0;
        for(char ch:arr2){
            index++;
            if(counts[ch-'a']>0){
                stack.push(ch);
                counts[ch-'a']--;
            }
            else{
                for(char i=ch;i<='z';i++){
                    if(counts[i-'a']>0){
                        stack.push(i);
                        counts[i-'a']--;
                        break;
                    }
                }
                isFound=true;
            }
            if(isFound)break;
        }
        isFound=false;
        if(index>stack.size() || stack.peek()==arr2[index-1]){
            while(!stack.isEmpty() && !isFound){
                char pre=stack.pop();
                counts[pre-'a']++;
                for(char ch=pre;ch<='z';ch++){
                    if(ch>pre && counts[ch-'a']>0){
                        stack.push(ch);
                        counts[ch-'a']--;
                        isFound=true;
                        break;
                    }
                }
            }
        }
        if(stack.isEmpty())return "";
        for(int i=0;i<26;i++){
            for(int j=0;j<counts[i];j++){
                stack.push((char)('a'+i));
            }
        }
        StringBuilder ans=new StringBuilder("");
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        String str=ans.reverse().toString();
        return str.equals(target)?"":str;
    }
}