class Solution {
    public String frequencySort(String s) {
        int[] arr=new int[256];
        int max=0;
        for(char ch:s.toCharArray()){
            arr[ch]++;
            max=Math.max(max,arr[ch]);
        }
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<256;i++){
            if(arr[i]==0)continue;
            String str=map.getOrDefault(arr[i],"");
            for(int j=0;j<arr[i];j++)str=str+(char)(i);
            map.put(arr[i],str);
        }
        StringBuilder ans=new StringBuilder("");
        for(int i=max;i>0;i--){
            if(map.containsKey(i))ans.append(map.get(i));
        }
        return ans.toString();
    }
}