class Solution {
    public int numberOfSpecialChars(String word) {
        //System.out.println('a');
        int ans=0;
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char ch:word.toCharArray()){
            int index;
            if(ch>='a' && ch<='z'){ 
                index=ch-'a';
                if(arr1[index]!=-1)arr1[index]=1;
                }
            else {
                index=ch-'A';
                if(arr2[index]!=-1)arr2[index]=1;
            }
            if(arr1[index]==1 && arr1[index]==arr2[index] ) {
                ans++;
                arr1[index]=-1;
                arr2[index]=-1;
            }
        }
        return ans;
    }
}