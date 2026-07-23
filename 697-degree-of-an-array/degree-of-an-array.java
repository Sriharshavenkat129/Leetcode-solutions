class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0,maxEle=nums.length;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            max=Math.max(max,map.get(n));
        }
        for(int key:map.keySet()){
            if(map.get(key)==max){
                maxEle=Math.min(maxEle,getDiff(key,nums));
            }
        }
        return maxEle;
    }
    public static int getDiff(int n,int[] arr){
        int start=0,end=arr.length-1;
        while(arr[start]!=n || n!=arr[end]){
            if(arr[start]!=n)start++;
            if(arr[end]!=n)end--;
        }
       // System.out.println(end+" "+start);
        return end-start+1;
    } 
}