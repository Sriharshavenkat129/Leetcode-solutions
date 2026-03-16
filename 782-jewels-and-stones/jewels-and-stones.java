class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:stones.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        int ans=0;
        for(char ch:jewels.toCharArray()){
            ans+=map.getOrDefault(ch,0);
        }
        return ans;
    }
}