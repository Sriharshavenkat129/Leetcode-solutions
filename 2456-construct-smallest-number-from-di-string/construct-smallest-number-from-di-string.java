class Solution {
    public String smallestNumber(String pattern) {
        int[] arr=new int[pattern.length()+1];
        return getlist("",pattern,arr).get(0);
        //return "";
    }
    public static ArrayList<String> getlist(String num,String pattern,int[] arr){
        ArrayList<String> l=new ArrayList<>();
        if(num.length()==pattern.length()+1){
            l.add(num);
            return l;
        }
        for(int i=1;i<=pattern.length()+1;i++){
            if(arr[i-1]==0){
                if(num.length()==0){
                            arr[i-1]=1;
                            l.addAll(getlist(num+String.valueOf(i),pattern, arr));
                            arr[i-1]=0;
                }
                else{
                char ch=pattern.charAt(num.length()-1);
                if(ch=='I' && i>num.charAt(num.length()-1)-'0'){
                    arr[i-1]=1;
                    l.addAll(getlist(num+i,pattern,arr));
                    arr[i-1]=0;
                }
                else if(ch=='D' && i<num.charAt(num.length()-1)-'0'){
                    arr[i-1]=1;
                    l.addAll(getlist(num+i,pattern,arr));
                    arr[i-1]=0;
            }
                }
        }
    }
        return l;
    }
}