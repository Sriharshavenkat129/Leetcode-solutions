class Solution {
    public List<String> validStrings(int n) {
       // System.out.println(getAns(n,""));
        return getAns(n,"");
    }
    public static ArrayList<String> getAns(int n,String ans){
        ArrayList<String> l=new ArrayList<>();
        if(ans.length()==n){
            l.add(ans);
            return l;
        }
        if(ans.length()==0) l.addAll(getAns(n,ans+"0"));
        if(ans.length()>0&& ans.charAt(ans.length()-1)!='0'){
            l.addAll(getAns(n,ans+'0'));
        }
        l.addAll(getAns(n,ans+'1'));
        return l;
    }
}