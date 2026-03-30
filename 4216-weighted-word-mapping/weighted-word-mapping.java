class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder("");
        for(String str:words){
            int sum=0;
            for(char ch:str.toCharArray()){
                sum+=weights[(int)ch-97];
            }
            System.out.println(sum);
            sum%=26;
            ans.append((char)(122-sum));
        }
        return ans.toString();
    }
}