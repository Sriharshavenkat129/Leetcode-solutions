class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str=new StringBuilder("");
        int index=0;
        int is=0;
        for(char c:word.toCharArray()){
            str.append(c);
            index++;
            if(ch==c) {
                is=1;
                break;
            }
        }
        if(is==0)return word;
        return str.reverse().toString()+word.substring(index,word.length());
    }
}