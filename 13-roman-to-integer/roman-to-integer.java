class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int pre=0;
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            int c=map.get(s.charAt(i));
            if(c<map.get(s.charAt(i+1))){
                pre=c;
            }
            else{
                ans+=(c-pre);
                pre=0;
            }
        }
        ans+=(map.get(s.charAt(s.length()-1))-pre);
        return ans;
    }
}