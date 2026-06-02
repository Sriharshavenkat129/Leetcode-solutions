class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int ls=landStartTime[i],le=landDuration[i];
            for(int j=0;j<waterStartTime.length;j++){
                int ws=waterStartTime[j],we=waterDuration[j];
                int pans=0;
                if(ls<ws){
                    pans+=ls+le;
                    if(pans>=ws)
                    pans+=we;
                    else pans+=(ws-pans)+we;
                }
                else{
                    pans+=ws+we;
                    if(pans>=ls) pans+=le;
                    else  pans+=(ls-pans)+le;
                }
                ans=Math.min(ans,pans);
            }
        }
        return ans;
    }
}