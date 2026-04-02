class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int l_m=0,l_g=0,l_p=0;
        int ans=0;
        for(int i=0;i<garbage.length;i++){
            if(charCheck(garbage[i],'G')) l_g=i;
            if(charCheck(garbage[i],'P')) l_p=i;
            if(charCheck(garbage[i],'M')) l_m=i;
            ans+=garbage[i].length();
        }
       // System.out.println(l_m+" "+l_g+" "+l_p+" "+ans);
       for(int i=0;i<travel.length;i++){
        if(i<l_m) ans+=travel[i];
        if(i<l_p) ans+=travel[i];
        if(i<l_g) ans+=travel[i];
       }
        return ans;
    }
    public boolean charCheck(String str,char ch){
        for(char c:str.toCharArray()) if(c==ch) return true;
        return false;
    }
}