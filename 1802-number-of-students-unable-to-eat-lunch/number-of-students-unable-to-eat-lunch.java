class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int z=0,o=0;
        for(int i:students){
            if(i==0)z++;
            else o++;
        }
        int index=0;
        int st=0;
        while(index<sandwiches.length){
            if(students[st]==sandwiches[index]){
                index++;
                if(students[st]==0)z--;
                else o--;
                students[st]=-1;
            }
            if(index==sandwiches.length)break;
            if(sandwiches[index]==1 && o==0)return z;
            if(sandwiches[index]==0 && z==0)return o;
            st++;
            st=st%students.length;
        }
        return 0;
    }
}