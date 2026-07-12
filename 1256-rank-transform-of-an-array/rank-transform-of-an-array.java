class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] newarr=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        if(arr.length==0)return new int[]{};
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(newarr[i]);
        }
        return arr;
    }
}