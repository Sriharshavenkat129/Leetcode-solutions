class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int ans=0;
        int max=0;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=0;i<nums.length;i++){
            int n=list.size();
            for(int j=0;j<n;j++){
                list.add(list.get(j)|nums[i]);
                if(max<(list.get(j)|nums[i])){
                    ans=0;
                    max=list.get(j)|nums[i];
                }
                if(max==(list.get(j)|nums[i])) ans++;
            }
        }
        System.out.println(list);
        return ans;
    }
}