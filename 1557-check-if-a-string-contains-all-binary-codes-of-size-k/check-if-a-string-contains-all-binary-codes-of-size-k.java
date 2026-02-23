class Solution {
    public boolean hasAllCodes(String s, int k) {
        /*
        ArrayList<String> pairs=new ArrayList<>();
        pairs.add("0");
        pairs.add("1");
        for(int i=1;i<k;i++){
            ArrayList<String> p=new ArrayList<>();
            for(String str:pairs){
                p.add(str+"0");
                p.add(str+"1");
            }
            pairs=p;
        }
        for(String str:pairs){
            if(!s.contains(str))return false;
        }
        return true;
        */
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i+k<=s.length();i++){
            int result = Integer.parseInt(s.substring(i,i+k), 2);
            set.add(result);
        }
        return set.size()==Math.pow(2,k);
    }
    public static int getbinarydigit(String str){
        int n=0;
        int pow=0;
        while(str.length()!=0){
            int s=str.length()-1;
            if(str.charAt(s)=='1')
                n+=Math.pow(2,pow);
            pow++;
        }
        return n;
    }
}