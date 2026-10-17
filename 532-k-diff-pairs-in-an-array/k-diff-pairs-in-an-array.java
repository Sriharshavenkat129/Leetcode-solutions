class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(k==0 && map.get(n)==2)ans++;
        }
        if(k==0)return ans;
        for(int key:map.keySet()){
            if(map.containsKey(key+k) && (map.get(key+k)!=-1 || map.get(key)!=-1)){
                ans++;
                map.put(key+k,-1);
                map.put(key,-1);
            }
        }
        return ans;
    }
}