class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String [] arranged=new String[words.length];
        for(String word:words){
            arranged[word.charAt(word.length()-1)-'1']=word.substring(0,word.length()-1);
        }
        /*
        System.out.println(Arrays.toString(arranged));
        StringBuilder str=new StringBuilder("");
        for(String word:arranged){
            str.append(word+" ");
        }
        return str.toString().substring(0,str.length()-1);
        */
        return String.join(" ",arranged);
    }
}