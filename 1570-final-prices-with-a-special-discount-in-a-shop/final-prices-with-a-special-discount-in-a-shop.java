// class Solution {
//     public int[] finalPrices(int[] prices) {
//         Stack<Integer> stack=new Stack<>();
//         int [] ans=new int[prices.length];
//         for(int i=prices.length-1;i>=0;i--){
//             while(!stack.isEmpty() && prices[i]<stack.peek())stack.pop();
//             if(stack.isEmpty()) ans[i]=prices[i];
//             else ans[i]=prices[i]-stack.peek();
//             stack.push(prices[i]);
//         }
//         return ans;
//     }
// }
class Solution {
    private int minCost(int[] prices, int index){
        for(int i=index; i<prices.length; i++){
            if(prices[i] <= prices[index-1]){
                return prices[i];
            }
        }
        return 0;
    }
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length;i++){
            prices[i] -= minCost(prices, i+1);
        }
        return prices;
    }

    
}