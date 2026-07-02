class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r=new LinkedList<>();
        Queue<Integer> d=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R')r.add(i);
            else d.add(i);
        }
        while(r.isEmpty()==false && d.isEmpty()==false){
            int r_index=r.poll();
            int d_index=d.poll();
            if(r_index<d_index)r.add(r_index+n);
            else d.add(d_index+n);
        }
        return r.isEmpty()?"Dire":"Radiant";
    }
}