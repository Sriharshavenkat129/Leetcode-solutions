class Solution {
    public int binaryGap(int n) {
        StringBuilder binary=new StringBuilder("");
        while(n!=0){
            binary.append(n%2);
            n/=2;
        }
        int ans=0;
        int pre=-1;
        for(int i=0;i<binary.length();i++){
            char ch=binary.charAt(i);
            if(pre==-1 && ch=='1')pre=i;
            else if(ch=='1'){
                ans=Math.max(ans,i-pre);
                pre=i;
            }
        }
        return ans;
    }
}