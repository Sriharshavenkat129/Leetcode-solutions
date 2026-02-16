class Solution {
    public int reverseBits(int n) {
        int ans=0;
        int power=2;
        StringBuilder s=new StringBuilder("");
        while(n>0){
            s.append(String.valueOf(n%2));
            n=n/2;
        }
        while(s.length()<32){
            s.append("0");
        }
        System.out.println(s);
        int index=31;
        while(index>=0){
            char ch=s.charAt(index);
            if(ch=='1'){
                if(index==31) ans+=1;
                else if(index==30) ans+=2;
                else{
                    ans+=power;
                }
            }
            if(index<31)power*=2;
            index--;
        }
        return ans;
    }
}