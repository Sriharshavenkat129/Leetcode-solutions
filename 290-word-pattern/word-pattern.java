class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] str=s.split(" ");
        // System.out.println(Arrays.toString(str));
        if(pattern.length()!=str.length)
            return false;
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(str[i])) return false;
            else if(map.containsValue(str[i]) && !map.containsKey(pattern.charAt(i))) return false;
            else map.put(pattern.charAt(i),str[i]);
        }
        return true;
    }
}