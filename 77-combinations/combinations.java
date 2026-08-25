class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        generate(1,n,k,l,ans);
        return ans;
    }
    public static void generate(int index,int n,int k,ArrayList<Integer> l,List<List<Integer>> ans){
        if(l.size()==k){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=index;i<=n;i++){
            l.add(i);
            generate(i+1,n,k,l,ans);
            l.remove(l.size()-1);
        }
    }
}