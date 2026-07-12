class Solution {
    public int digitFrequencyScore(int n) {
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(n!=0){
            map.put(n%10,map.getOrDefault(n%10,0)+1);
            n/=10;
        }
        for(int key:map.keySet()){
            ans=ans+(map.get(key)*key);
        }
        return ans;
    }
}