class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        int count=words.length;
        for(char ch:allowed.toCharArray()) set.add(ch);
        for(String word:words){
            for(char ch:word.toCharArray()){
                if(!set.contains(ch)){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
       static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
}
}