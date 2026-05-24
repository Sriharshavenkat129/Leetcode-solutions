class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans=new int[s.length()];
        int r=startPos[0],c=startPos[1];
        for(int i=0;i<s.length();i++){
            int count=0;
            startPos[0]=r;
            startPos[1]=c;
            for(int j=i;j<s.length();j++){
                if(countsteps(n,startPos,s.charAt(j))==1) count++;
                else break;
            }
            ans[i]=count;
        }
        return ans;
    }
    public static int countsteps(int n,int[] st,char ch){
        int r=st[0],c=st[1];
        if(ch=='U')r--;
        if(ch=='D')r++;
        if(ch=='L')c--;
        if(ch=='R')c++;
        if(c<n && r<n && c>=0 && r>=0){
            st[0]=r;
            st[1]=c;
            return 1;
        }
        else return 0;
    }
}