class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        else if(s.equals(goal))return true;
        for(int i=1;i<s.length();i++){
        String front=s.substring(i,s.length());
        String back=s.substring(0,i);
        //System.out.println(front+"  "+back);
        if((front+back).equals(goal)) return true;
        }
        return false;
    }
}