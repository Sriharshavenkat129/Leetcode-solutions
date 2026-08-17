class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].trim().length()>0){
            ans.append(arr[i].trim());
            if(i!=0)ans.append(" ");
            }
        }
        return ans.toString();
    }
}