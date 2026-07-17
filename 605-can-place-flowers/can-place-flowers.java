class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // for(int i=0;i<flowerbed.length;i++){
        //     if(flowerbed[i]==1)i++;
        //     else if(i+1<flowerbed.length && flowerbed[i+1]==0){
        //         n--;
        //         i++;
        //     }
        // }
        // if(flowerbed.length >=2 && flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)n--;
        // return n==0;
        if(n<1)return true;
        if(flowerbed.length==1)return (flowerbed[0]==0 && n<=1);
        int count=0,en=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0)count++;
            else{
                int r=count/2;
                if(en==1 && r!=0 && count%2==0)r--;
                n-=r;
                count=0;
                en=1;
            }
        }
        int r=count/2;
        n-=r;
        if(en==0 && count%2!=0)n--;
        return n<=0;
    }
}