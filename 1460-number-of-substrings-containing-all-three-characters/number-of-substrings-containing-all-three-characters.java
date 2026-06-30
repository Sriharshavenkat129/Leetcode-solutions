class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        char[] chars=s.toCharArray();
        int pre=0;
        int[] counts=new int[3];
        for(int i=0;i<chars.length;i++){
            counts[chars[i]-'a']+=1;
            if(check(counts)){
                while(check(counts)){
                    ans+=getCount(counts,pre,i,chars.length);
                    counts[chars[pre]-'a']--;
                    pre++;
                }
            }
        }
        return ans;
    }
    public static boolean check(int[] arr){
        if(arr[0]>=1 && arr[1]>=1 && arr[2]>=1)return true;
      //  System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        return false;
    }
    public static int getCount(int[]arr,int left,int right,int length){
        return length-right;
    }
}