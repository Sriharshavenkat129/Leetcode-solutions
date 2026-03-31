class Solution {
    public String restoreString(String s, int[] indices) {
        // String ans = s;
        StringBuilder builder = new StringBuilder(s);
        // for(int i = 0 ;i<s.length();i++){
        //    builder.append(s.charAt(i));
        // }
        for(int i = 0 ;i<s.length();i++){
           builder.setCharAt(indices[i] , s.charAt(i));
        }

        return builder.toString();
    }
}