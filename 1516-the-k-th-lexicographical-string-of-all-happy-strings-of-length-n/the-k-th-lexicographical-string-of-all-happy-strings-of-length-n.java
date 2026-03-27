class Solution {
    public String getHappyString(int n, int k) {
        //System.out.println(getAll(n,""));
        ArrayList<String>l= getAll(n,"");
        return l.size()<k?"":l.get(k-1);
    }
    public static ArrayList<String> getAll(int n,String hp){
        ArrayList<String> l=new ArrayList<>();
        if(hp.length()==n){
            l.add(hp);
            return l;
        }
        for(int i=97;i<100;i++){
            if(hp.length()==0 || hp.charAt(hp.length()-1)!=(char)i)
            l.addAll(getAll(n,hp+(char)i));
        }
        return l;
    }
}