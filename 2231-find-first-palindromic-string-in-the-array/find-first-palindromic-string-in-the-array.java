class Solution {
    public String firstPalindrome(String[] words) {
        for(String str:words){
            if(isPalindrom(str)) return str;
        }
        return "";
    }
    public static boolean isPalindrom(String str){
        char[] arr=str.toCharArray();
        int start=0,end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}