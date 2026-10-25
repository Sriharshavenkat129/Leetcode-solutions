class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days=new int[12];
        int[] dates={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        days[1]=31;
        for(int i=2;i<12;i++){
            days[i]=dates[i-1]+days[i-1];
        }
        int a1=days[Integer.valueOf(arriveAlice.substring(0,2))-1]+Integer.valueOf(arriveAlice.substring(3,5));
        int a2=days[Integer.valueOf(arriveBob.substring(0,2))-1]+Integer.valueOf(arriveBob.substring(3,5));
        int d1=days[Integer.valueOf(leaveAlice.substring(0,2))-1]+Integer.valueOf(leaveAlice.substring(3,5));
        int d2=days[Integer.valueOf(leaveBob.substring(0,2))-1]+Integer.valueOf(leaveBob.substring(3,5));
        if(a1<=a2){
            if(d1<a2)return 0;
            return Math.min(d1,d2)-a2+1;
        }
        else{
            if(d2<a1)return 0;
            return Math.min(d1,d2)-a1+1;
        }
    }
}