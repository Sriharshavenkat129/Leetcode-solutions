class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> l:knowledge){
            map.put(l.get(0),l.get(1));
        }
        int start=0;
        StringBuilder ans=new StringBuilder("");
        char [] arr=s.toCharArray();
        while(start<s.length()){
            if(arr[start]=='('){
                String str="";
                start++;
                while(arr[start]!=')'){
                    str+=arr[start];
                    start++;
                }
                ans.append(map.getOrDefault(str,"?"));
            }
            else{
                ans.append(arr[start]);
            }
            start++;
        }
        return ans.toString();
    }
}