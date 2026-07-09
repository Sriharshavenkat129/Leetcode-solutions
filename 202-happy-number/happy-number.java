class Solution {
    public boolean isHappy(int n) {
        int newn=0;
        HashSet<Integer> set=new HashSet<>();
        set.add(n);
        while(n!=0){
            int r=n%10;
            newn=newn+r*r;
            n/=10;
            if(n==0 && newn!=1){
                n=newn;
                if(set.contains(n))return false;
                else set.add(n);
                newn=0;
            }
        }
        return newn==1;
    }
}