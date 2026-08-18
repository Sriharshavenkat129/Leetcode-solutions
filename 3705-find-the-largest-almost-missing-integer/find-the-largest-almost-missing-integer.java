class Solution {
    public int largestInteger(int[] nums, int k) {
        int [] counts=new int[51];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet())counts[key]++;
        int left=0,right=k;
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            map.put(nums[left],map.get(nums[left])-1);
            left++;
            right++;
            for(int key:map.keySet()){
                if(map.get(key)>0)counts[key]++;
            }
        }
        System.out.println(Arrays.toString(counts));
        for(int i=50;i>=0;i--){
            if(counts[i]==1)return i;
        }
        return -1;
    }
}