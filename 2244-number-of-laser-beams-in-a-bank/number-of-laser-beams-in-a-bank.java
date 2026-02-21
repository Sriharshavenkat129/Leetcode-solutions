class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int pre=0;
        for(String str:bank){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1')count++;
            }
            if(count!=0){
                ans+=pre*count;
                pre=count;
            }
        }
        return ans;
    }
}