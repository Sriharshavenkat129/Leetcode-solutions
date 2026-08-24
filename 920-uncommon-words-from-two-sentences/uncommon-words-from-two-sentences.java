class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:s1.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:s2.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int size=0;
        for(String key:map.keySet()){
            if(map.get(key)==1)size++;
        }
        String []ans=new String[size];
        int index=0;
        for(String key:map.keySet()){
            if(map.get(key)==1){
            ans[index]=key;
            index++;
            }
        }
        return ans;
    }
}