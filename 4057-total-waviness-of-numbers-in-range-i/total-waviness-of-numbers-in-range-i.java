class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=getWaves(i);
        }
        return ans;
    }
    public static int getWaves(int num){
        if(num<=100)return 0;
        int waves=0;
        String s=String.valueOf(num);
        for(int i=1;i<s.length()-1;i++){
            char before=s.charAt(i-1);
            char middle=s.charAt(i);
            char after=s.charAt(i+1);
            if(before<middle && middle>after)waves++;
            else if(before>middle && middle<after)waves++;
        }
        return waves;
    }
}