class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[] ans=new int[arr.length];
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> l=map.getOrDefault(Integer.bitCount(arr[i]),new ArrayList());
            l.add(i);
            map.put(Integer.bitCount(arr[i]),l);
        }
        int index=0;
        for(ArrayList<Integer> l:map.values()){
            for(int n:l){
                ans[index]=arr[n];
                index++;
            }
        }
        return ans;
    }
}