class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
     HashMap<String,Integer> map=new HashMap<>();
     HashMap<String,Integer> diff=new HashMap<>();
     for(int i=0;i<list1.length;i++){
        map.put(list1[i],i);
     }   
     int ans=Integer.MAX_VALUE;
     for(int i=0;i<list2.length;i++){
        if(map.containsKey(list2[i])){
            int dif=map.get(list2[i])+i;
            ans=Math.min(ans,dif);
            diff.put(list2[i],dif);
        }
     }
    ArrayList<String> arr=new ArrayList<>();
    for(String key:diff.keySet()){
        if(diff.get(key)==ans)arr.add(key);
    }
    String [] org=new String[arr.size()];
    for(int i=0;i<arr.size();i++)org[i]=arr.get(i);
     return org;
    }
}