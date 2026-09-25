class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> l=new ArrayList<>();
        
        List<List<Integer>> ans=new ArrayList<>();
        generate(k,n,l,ans,0);
        return ans;

    }
    public static void generate(int k,int target,List<Integer> l,List<List<Integer>> ans,int sum){
        if(l.size()==k && sum==target){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(l.size()==k)
            return;
        for(int i=l.size()>0?l.get(l.size()-1)+1:1;i<=9;i++){
            if((sum+i)<=target){
                l.add(i);
                generate(k,target,l,ans,sum+i);
                l.remove(l.size()-1);
            }
        }
    }
}