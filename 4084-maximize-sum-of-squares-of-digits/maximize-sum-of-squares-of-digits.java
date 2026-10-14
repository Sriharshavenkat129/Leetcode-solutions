class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum)return "";
        int current=9;
        StringBuilder ans=new StringBuilder("");
        while(ans.length()<num){
            if(sum>=current){
                sum-=current;
                ans.append(current+"");
            }
            else{
                current--;
            }
        }
        return ans.toString();
    }
}