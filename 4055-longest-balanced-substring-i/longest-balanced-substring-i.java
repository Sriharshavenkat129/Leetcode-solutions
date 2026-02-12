class Solution {
    public int longestBalanced(String s) {
        int [] arr=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            Arrays.fill(arr,0);
            if(ans>s.length()-i+1) return ans;
            for(int j=i;j<s.length();j++){
                boolean matched=true;
                arr[s.charAt(j)-'a']+=1;
                for(int c:arr){
                    if(c>0 && c!=arr[s.charAt(j)-'a']){
                        matched=false;
                        break;
                    }
                }
                if(matched)
                ans=Math.max(j-i+1,ans);
            }
        }
        return ans;
    }
}