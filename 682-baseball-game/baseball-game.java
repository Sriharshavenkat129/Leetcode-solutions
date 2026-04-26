class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> l=new ArrayList<>();
        int ans=0;
        for(String str:operations){
            char ch=str.charAt(0);
            if(ch=='+'){
                l.add(l.get(l.size()-1)+l.get(l.size()-2));
            }
            else if(ch=='C'){
                l.remove(l.size()-1);
            }
            else if(ch=='D'){
                l.add(l.get(l.size()-1)*2);
            }
            else{
                l.add(Integer.parseInt(str));
            }
            //System.out.println(l.toString());
        }
        //System.out.println(l.toString());
        for(int i:l) ans+=i;
        return ans;
    }
}