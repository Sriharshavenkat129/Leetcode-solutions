class Solution {
    public boolean detectCapitalUse(String word) {
        int Capitals_count=0;
        for(char ch:word.toCharArray()){
            if(ch>='A' && ch<='Z')Capitals_count++;
        }
        if(Capitals_count==1 && word.charAt(0)>='A' && word.charAt(0)<='Z'||Capitals_count==0 || Capitals_count==word.length())return true;
        return false;
    }
}