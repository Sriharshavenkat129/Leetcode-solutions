class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lowers=new int[26];
        int[] uppers=new int[26];
        HashSet<Integer> removed=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(char ch:word.toCharArray()){
            int index;
            if(ch>='a' && ch<='z'){
                index=ch-'a';
                lowers[index]=1;
                if(removed.contains(index)==false && uppers[index]!=0 && lowers[index]>=uppers[index]){
                    ans--;
                    removed.add(index);
                }
            }
            else{
                index=ch-'A';
                uppers[index]=1;
            }
            if(set.contains(index)==false && lowers[index]==uppers[index] && lowers[index]>=1){
                ans++;
                set.add(index);
            }
        }
        return ans;
    }
}