class Solution {
    public String smallestPalindrome(String s) {
        int[] counts=new int[26];
        char odd=' ';
        for(char ch:s.toCharArray()){
            counts[ch-'a']++;
        }
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(counts[i]%2!=0){
                odd=ch;
                counts[i]--;
            }
            for(int j=0;j<counts[i]/2;j++){
                ans.append(ch);
            }
        }
        StringBuilder rev=new StringBuilder(ans).reverse();
        // for(int i=ans.length()-1;i>=0;i--){
        //     rev.append(ans.charAt(i));
        // }
        if(odd!=' '){ans.append(odd);}
        return ans.append(rev).toString();
    }
}