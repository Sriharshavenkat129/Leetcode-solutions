class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(candidates);
        getAns(candidates,target,l,ans,0);
        return ans; 
    }
    public static void getAns(int[] arr,int target,ArrayList<Integer> l,List<List<Integer>> ans,int index){
        if(target==0){
            ArrayList<Integer> newl=new ArrayList<>(l);
             ans.add(newl);
            return;
        }
        for(int i=index;i<arr.length;i++){
            if (i > index && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break; 
            if(arr[i]!=-1 && arr[i]<=target){
                l.add(arr[i]);
                getAns(arr,target-arr[i],l,ans,i+1);
                l.remove(l.size()-1);
            }
        }
    }
}