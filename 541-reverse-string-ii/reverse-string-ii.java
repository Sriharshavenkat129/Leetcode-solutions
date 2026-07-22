class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans=new StringBuilder("");
        int start=0,end=k;
        while(start<s.length()){
            int r=end-1;
            while(r>=start){
                if(r<s.length())ans.append(s.charAt(r));
                r--;
            }
            r=end;
            start=start+(2*k);
            end=start+k;
            while(r<s.length() && r<start){
                ans.append(s.charAt(r));
                r++;
            }
        }
        return ans.toString();
    }
}