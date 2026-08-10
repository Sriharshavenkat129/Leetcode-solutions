class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String str=licensePlate.toLowerCase();
        int[] arr=new int[26];
        int total_count=0;
        for(char ch:str.toCharArray()){
            if(ch>='a' && ch<='z'){
                arr[ch-'a']++;
                total_count++;
            }
        };
        String ans="";
        for(String word:words){
            int c=0;
            int [] cur=new int[26];
            for(int i=0;i<word.length();i++){
                if(cur[word.charAt(i)-'a']<arr[word.charAt(i)-'a']){
                    c++;
                    cur[word.charAt(i)-'a']++;
                }
            }
            if(c>=total_count){
                if(ans.length()==0)ans=word;
                else{
                    if(ans.length()>word.length()){
                        ans=word;
                    }
                }
            }
        }
        return ans;
    }
}