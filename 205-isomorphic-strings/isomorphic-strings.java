class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=t.charAt(i)) return false;
            else if(map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i))) return false;
            else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}