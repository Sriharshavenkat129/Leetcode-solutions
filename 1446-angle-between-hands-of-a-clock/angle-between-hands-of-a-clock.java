class Solution {
    public double angleClock(int hours, int minutes) {
        double angleformin=0.5;
        if(hours==12)hours=0;
        double hd=hours*30+minutes*angleformin;
        double md=minutes*6;
        //System.out.println(hd+"  "+md);
        return Math.min(Math.abs(hd-md),360-Math.abs(hd-md));
    }
}