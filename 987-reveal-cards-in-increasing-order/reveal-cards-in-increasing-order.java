class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int index=0;
        int[] ans=new int[deck.length];
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            queue.add(i);
        }
        Arrays.sort(deck);
        while(queue.isEmpty()==false){
            int i=queue.poll();
            ans[i]=deck[index];
            if(queue.isEmpty()==false)queue.add(queue.poll());
            index++;
        }
        return ans;
    }
}