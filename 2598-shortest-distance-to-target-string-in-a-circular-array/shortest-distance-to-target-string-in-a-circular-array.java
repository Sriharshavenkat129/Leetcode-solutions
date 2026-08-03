class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int i=startIndex,j=i,steps=0,hit1=0,hit2=0;
        while(words[i].equals(target)==false && words[j].equals(target)==false){
            i++;
            j--;
            if(i==words.length)i=0;
            if(j<0){
                j=words.length-1;
            }
            steps++;
            if(steps>words.length)return -1;
        }
        return steps;
    }
}