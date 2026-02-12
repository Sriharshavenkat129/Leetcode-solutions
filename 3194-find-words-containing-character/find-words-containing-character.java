class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            //if(words[i].contains(String.valueOf(x))) ans.add(i);
            for(char c:words[i].toCharArray()){
                if(c==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}