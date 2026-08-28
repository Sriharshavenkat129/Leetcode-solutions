class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> l=new ArrayList<>(map.keySet());
         for(int key:l){
             if(map.get(key)!=2){
                map.remove(key);
             }
         }
        return new ArrayList<>(map.keySet());
    }
}