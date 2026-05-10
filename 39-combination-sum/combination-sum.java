class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        getAns(candidates,target,ans,l,0);
        return ans;
    }
    public static void getAns(int[] arr,int target,List<List<Integer>> ans,List<Integer> l,int index){
        if(target==0){
            System.out.println(l.toString());
            List<Integer> list=new ArrayList<>(l);
            ans.add(list);
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(target-arr[i]>=0){
                l.add(arr[i]);
                getAns(arr,target-arr[i],ans,l,i);
                l.remove(l.size()-1);
            }
        }
    }
}