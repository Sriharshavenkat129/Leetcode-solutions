class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []arr=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String word:words){
            String str="";
            for(char ch:word.toCharArray()){
                str+=arr[ch-'a'];
            }
            set.add(str);
        }
        return set.size();
    }
}