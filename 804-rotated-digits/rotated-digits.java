class Solution {
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            if(isValid(i))ans++;
        }
        return ans;
    }
    public static boolean isValid(int n){
        String str=String.valueOf(n);
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='3'||arr[i]=='4'||arr[i]=='7') return false;
            else if(arr[i]=='2') arr[i]='5';
            else if(arr[i]=='5') arr[i]='2';
            else if(arr[i]=='6') arr[i]='9';
            else if(arr[i]=='9') arr[i]='6';
        }
        int num=0;
        for(char i:arr){
            num=(num*10)+(i-'0');
        }
        return num!=n;
    }
}