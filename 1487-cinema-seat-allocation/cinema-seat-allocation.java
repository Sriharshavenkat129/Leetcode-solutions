class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans=0;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            ArrayList<Integer> l=map.getOrDefault(reservedSeats[i][0],new ArrayList<>());
            l.add(reservedSeats[i][1]);
            map.put(reservedSeats[i][0],l);
        }
        for(int key:map.keySet()){
            int count=0;
            int pre=0;
            boolean possible=true;
            HashSet<Integer> set=new HashSet<>(map.get(key));
            System.out.println(set.toString());
            for(int i=2;i<=5;i++){
                if(set.contains(i)){
                    possible=false;
                }
            }
            if(possible){
                ans++;
                pre=1;
            }
            if(pre!=1){
                possible=true;
                for(int i=4;i<=7;i++){
                    if(set.contains(i)){
                    possible=false;
                }
                }
                if(possible){
                    ans++;
                    pre=2;
                }
            }
            if(pre!=2){
                possible=true;
                for(int i=6;i<=9;i++){
                    if(set.contains(i)){
                        possible=false;
                    }
                }
                if(possible)ans++;
            }
        }
        return ans+(n-map.size())*2;
    }
}