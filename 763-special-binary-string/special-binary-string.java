class Solution {
    public String makeLargestSpecial(String s) {
        int count=0;
        int startIndex=0;
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' )count++;
            else count--;
            if(count==0){
                String sub=s.substring(startIndex,i+1);
                String inner=sub.substring(1,sub.length()-1);
                list.add("1"+makeLargestSpecial(inner)+"0");
                startIndex=i+1;
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        StringBuilder ss=new StringBuilder("");
        for(String str:list) ss.append(str);
        return ss.toString();
        
    }
}