class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> ans=new HashSet<>();
        int[] visited=new int[tiles.length()];
        getAns(tiles,visited,"",ans);
      //  System.out.println(ans.toString());
        return ans.size();
    }
    public static void getAns(String tiles,int[] visited,String ans,HashSet<String> set){
        if(set.contains(ans)) return;
        if(ans.length()!=0) set.add(ans);
        for(int i=0;i<tiles.length();i++){
            if(visited[i]==0){
                visited[i]=1;
                getAns(tiles,visited,ans+tiles.charAt(i),set);
                visited[i]=0;
            }
        }
    }
}