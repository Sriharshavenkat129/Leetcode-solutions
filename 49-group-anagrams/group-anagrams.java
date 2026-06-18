class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String str:strs){
            String s=getSortedString(str);
            // System.out.println(s);
            ArrayList<String> l=map.getOrDefault(s,new ArrayList<>());
            l.add(str);
            map.put(s,l);
        }
        List<List<String>> ans=new ArrayList<>();
        for(ArrayList<String> l:map.values()){
            ans.add(l);
        }
        return ans;
    }
    public static String getSortedString(String str){
        char[] arr=str.toCharArray();
        if(str.length()==0)return "";
        Arrays.sort(arr);
        StringBuilder s=new StringBuilder("");
        for(char ch:arr)s.append(ch);
        return s.toString();
    }
}