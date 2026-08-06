class Solution {
    public int smallestNumber(int n, int t) {
        int current_product=1;
        int num=n;
        while(num>0){
            int r=num%10;
            num/=10;
            current_product*=r;
        }
        if(current_product==0 || current_product%t==0)return n;
        int add=0;
        for(int i=n%10;i<10;i++){
            current_product/=i;
            if(i<9)current_product*=(i+1);
            add++;
            if(current_product%t==0)break;
        }
        return n+add;
    }
}