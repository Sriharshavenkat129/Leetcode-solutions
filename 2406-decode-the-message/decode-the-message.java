class Solution {
    public String decodeMessage(String key, String message) {
        int c=97;
        HashMap<Character,Character> map=new HashMap<>();
        for(char ch:key.toCharArray()){
            if(!map.containsKey(ch) && ch!=' ') {
                map.put(ch,(char)c);
                c++;
            }
        }
        StringBuilder ans=new StringBuilder("");
        for(char ch:message.toCharArray()){
            if(ch==' ')ans.append(ch);
            else ans.append(map.get(ch));
        }
        return ans.toString();
    }
}