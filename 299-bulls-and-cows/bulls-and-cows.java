class Solution {
    public String getHint(String secret, String guess) {
        if(secret.equals(guess)) return secret.length()+"A0B";
        int bulls=0,cows=0;
        HashSet<Integer> set=new HashSet<>();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:secret.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        for(int i=0;i<guess.length();i++){
            char ch=guess.charAt(i);
            if(ch==secret.charAt(i)){
                bulls++;
                map.put(ch,map.get(ch)-1);
                set.add(i);
            }
            }
        for(int i=0;i<guess.length();i++){
            char ch=guess.charAt(i);
                if(set.contains(i)==false && map.containsKey(ch) && map.get(ch)!=0){
                    map.put(ch,map.get(ch)-1);
                    cows++;
                }
        }
        return bulls+"A"+cows+"B";
    }
}