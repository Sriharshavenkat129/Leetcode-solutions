class Solution {
    public int[] decrypt(int[] code, int k) {
       int[] arr=new int[code.length*2];
       for(int i=0;i<arr.length;i++){
        arr[i]=code[i%code.length];
       } 
       int[] ans=new int[code.length];
       if(k==0)return ans;
       if(k>0){
        int pre=1;
        int index=1;
        int current_sum=0;
        for(int i=pre;i<=k;i++){
            current_sum+=arr[i];
        }
        ans[0]=current_sum;
        for(int i=k+1;i<arr.length && index<ans.length;i++){
            current_sum+=arr[i];
            current_sum-=arr[pre];
            pre++;
            ans[index]=current_sum;
            index++;
        }
       }
       else{
        int pre=arr.length-2;
        int index=ans.length-1;
        int current_sum=0;
        int j=arr.length-2;
        for(int i=0;i<Math.abs(k);i++){
            current_sum+=arr[j];
            j--;
        }
        ans[index]=current_sum;
        index--;
        for(int i=j;i>=0 && index>=0 ;i--){
            current_sum+=arr[i];
            current_sum-=arr[pre];
            pre--;
            ans[index]=current_sum;
            index--;
        }
       }
       return ans;
    }
}