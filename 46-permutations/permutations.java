class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int num:nums){
            if(ans.size()==0){
                List<Integer> l=new ArrayList<>();
                l.add(num);
                ans.add(l);
            }
            else{
                List<List<Integer>> temp=new ArrayList<>();
                for(List<Integer> l:ans){
                    for(int i=0;i<=l.size();i++){
                        List<Integer>tl=new ArrayList<>(l);
                        tl.add(i,num);
                        temp.add(tl);
                    }
                }
                ans=temp;
            }
        }
        return ans;
    }
}