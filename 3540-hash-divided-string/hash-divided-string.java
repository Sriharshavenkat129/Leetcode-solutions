class Solution {
    public String stringHash(String s, int k) {
        char [] letters=new char[26];
        for(int i=0;i<26;i++){
            letters[i]=(char)('a'+i);
        }
        StringBuilder ans=new StringBuilder("");
        int index=0;
        for(int i=0;i<s.length();i++){
            if(i!=0 && i%k==0) {
                ans.append(letters[index%26]);
                index=0;
            }
            index+=s.charAt(i)-'a';
            //System.out.println(index);
        }
        ans.append(letters[index%26]);
        return ans.toString();
    }
}