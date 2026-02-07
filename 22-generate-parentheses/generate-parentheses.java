class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
       // helper(1,n,ans);
       helper(ans,0,0,"",n);
        return ans;
    }
    public void helper(List<String>ans,int left,int right,String s,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(left<n){
            helper(ans,left+1,right,s+"(",n);
        }
        if(right<left){
            helper(ans,left,right+1,s+")",n);
        }
    }
    /*
    public void helper(int i,int n,List<String>ans){
        if(i>n)
        return;
        else{
            List<String> newans=new ArrayList<>();
            if(i==1){
                ans.add("()");
            }
            else{
                for(int j=0;j<ans.size();j++){
                    String s=ans.get(j);
                    newans.add(s+"()");
                    newans.add("("+s+")");
                    if(j>0)
                    newans.add("()"+s);
                }
                ans.clear();
                ans.addAll(newans);
            }
        }
        helper(i+1,n,ans);
    }
    */
}