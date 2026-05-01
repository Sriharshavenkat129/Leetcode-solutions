class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(getReversed(words[i]).equals(words[j]))ans++;
            }
        }
        return ans;
    }
    public static String getReversed(String str){
        StringBuilder rev=new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
}