class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int[] visited=new int[nums.length];
        List<Integer> l=new ArrayList<>();
        generate(ans,nums,l,visited);
        return ans;
    }
    public static void generate(List<List<Integer>> ans,int[] arr,List<Integer> list,int[] visited){
        //System.out.println(list.toString());
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1] && visited[i-1]==0)
            continue;
            else{
                if(visited[i]==0){
                    list.add(arr[i]);
                    visited[i]=1;
                    generate(ans,arr,list,visited);
                    list.remove(list.size()-1);
                    visited[i]=0;
                }
            }
        }
    }
}