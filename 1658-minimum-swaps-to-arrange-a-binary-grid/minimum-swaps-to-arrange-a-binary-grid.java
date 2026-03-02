class Solution {
    public int minSwaps(int[][] grid) {
        ArrayList<Integer> counts=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            int count=0;
            for(int j=grid.length-1;j>=0 && grid[i][j]!=1;j--){
                count++;
            }
            counts.add(count);
        }
       // System.out.println(Arrays.toString(counts));
        int ans=0;
        for(int i=0;i<counts.size();i++){
            if(counts.get(i)<grid.length-i-1){
                    boolean found=false;
                for(int j=i+1;j<counts.size();j++){
                    if(found==false && counts.get(j)>=counts.size()-i-1){
                        ans+=(j-i);
                        int n=counts.get(j);
                        counts.remove(j);
                        counts.add(i,n);
                        found=true;
                    }
                }
                if(found==false) return -1;
            }
        }
        return ans;
        //return 0;
    }
}