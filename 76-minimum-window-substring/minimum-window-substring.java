class Solution {
    public String minWindow(String s, String t) {
        int left=0;
        int ans=s.length();
        String str="";
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> counts=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            counts.put(s.charAt(i),counts.getOrDefault(s.charAt(i),0)+1);
            while(isValid(counts,map)){
                //System.out.println(left+" "+i);
                if(ans>=(i-left+1)){
                    ans=(i-left+1);
                    str=s.substring(left,i+1);
                }
                counts.put(s.charAt(left),counts.get(s.charAt(left))-1);
                left++;
            }
        }
        return str;
    }
    public static boolean isValid(HashMap<Character,Integer> arr,HashMap<Character,Integer> map){
        for(char key:map.keySet()){
            if(arr.getOrDefault(key,0)<map.get(key))return false;
        }
        return true;
    }
}