class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        /*
        if(s.length()==0 || s.charAt(s.length()-1)!='0')return false;
        Boolean arr[]=new Boolean[s.length()];
        return getAns(0,s,minJump,maxJump,arr);
    }
    public static boolean getAns(int index,String s,int min,int max,Boolean []arr){
        if(index==s.length()-1) return true;
        if(arr[index]!=null) return arr[index];
        boolean ans=false;
        for(int i=Math.min(index+max,s.length()-1);i>=index+min;i--){
            if(s.charAt(i)=='0'){
            boolean res=getAns(i,s,min,max,arr);
            if(res) arr[index]=true;
            ans|=res;
            }
        }
        return ans;
    }
    */
    Queue<Integer> queue=new LinkedList<>();
    if(s.length()==0 || s.charAt(s.length()-1)!='0')return false;
    if(maxJump>=s.length()-1)return true;
    queue.offer(0);
    int further=0;
    while(!queue.isEmpty()){
        int index=queue.poll();
        if(index==s.length()-1)return true;
        int start=Math.max(index+minJump,further+1);
        int end=Math.min(index+maxJump,s.length()-1);
        for(int i=start;i<=end;i++){
            if(s.charAt(i)=='0')queue.offer(i);
        }
        further=Math.min(index+maxJump,s.length()-1);
    }
    return false;
    }
}