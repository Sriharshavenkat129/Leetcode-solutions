class Solution {
    public String convertDateToBinary(String date) {
        int year=Integer.valueOf(date.substring(0,4));
        int month=Integer.valueOf(date.substring(5,7));
        int day=Integer.valueOf(date.substring(8,date.length()));
        return getBinary(year)+"-"+getBinary(month)+"-"+getBinary(day);
    }
    public static String getBinary(int n){
        StringBuilder str=new StringBuilder("");
        while(n!=0){
            str.append(n%2);
            n/=2;
        }
        return str.reverse().toString();
    }
}