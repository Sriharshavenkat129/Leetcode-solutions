class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int num:arr1){
            while(num!=0){
                //System.out.println(num);
                set.add(num);
                num/=10;
                if(set.contains(num)) break;
            }
        }
        for(int num:arr2){
            while(num!=0){
                int r=num;
                int count=(int)(Math.log(r)/Math.log(10))+1;
                if(set.contains(num)){
                    ans=Math.max(ans,count);
                    break;
                }
                num/=10;
            }
        }
        return ans;
    }
}