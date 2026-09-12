class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(ans,0,0,n,"");
        return ans;
    }
    public void generate(List<String> ans,int left,int right,int n,String str){
        if(left==n && right==n)
        ans.add(str);
        if(left<n){
            generate(ans,left+1,right,n,str+"(");
        }
        if(right<left && right<n){
            generate(ans,left,right+1,n,str+")");
        }
    }
}