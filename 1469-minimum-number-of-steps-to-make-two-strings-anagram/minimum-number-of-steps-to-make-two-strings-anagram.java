class Solution {
    public int minSteps(String s, String t) {
        if(s.length()!=t.length()) return -1;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]-=1;
            arr[t.charAt(i)-97]+=1;
        }
        int ans=0;
        for(int num:arr){
            if(num>0) ans+=num;
        }
        return ans;
    }
}