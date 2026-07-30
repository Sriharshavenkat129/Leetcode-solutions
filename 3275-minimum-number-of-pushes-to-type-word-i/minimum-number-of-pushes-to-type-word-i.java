class Solution {
    public int minimumPushes(String word) {
        int done=word.length()/8;
        int rem=word.length()%8;
        int ans=(done+1)*rem;
        while(done>0){
            ans=ans+8*done;
            done--;
        }
        return ans;
    }
}