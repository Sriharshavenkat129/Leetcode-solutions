class Solution {
    public String simplifyPath(String path) {
        path.replace("//","/");
        path.replace("///","/");
        String[] words=path.split("/");
        //System.out.println(Arrays.toString(words));
        // StringBuilder ans=new StringBuilder("");
        // for(int i=0;i<words.length;i++){
        //     if(words[i].equals("..")==false && i<words.length-1 && words[i+1].equals("..")==false && words[i]!="")
        //     ans.append("/"+words[i]);
        // }
        // if(words[words.length-1].equals(".")==false && words[words.length-1].equals("..")==false )
        // ans.append("/"+words[words.length-1]);
        // return ans.length()!=0?ans.toString():"/";
        ArrayList<String>l=new ArrayList<String>();
        for(String word:words){
            if(word.equals("..")==true && l.size()>0)l.remove(l.size()-1);
            else if(word.equals(".")==false && word!="" && word.equals("..")==false)
            l.add(word);
        }
        //System.out.println(l);
        StringBuilder ans=new StringBuilder("");
        for(String word:l){
            ans.append("/"+word);
        }
        return ans.length()>0?ans.toString():"/";
    }
}