class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int n=0;
            int num=i;
            while(num!=0){
                if(num%2==1)n++;
                num/=2;
            }
            System.out.println(n);
            if(isprime(n))count++;
        }
        return count;
    }
    public boolean isprime(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}