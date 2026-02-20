class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        /*
        int seat=0,student=0;
        for(int i=0;i<seats.length;i++){
            seat+=seats[i];
            student+=students[i];
        }
        return Math.abs(seat-student);
        */
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int i=0;i<seats.length;i++){
            ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}