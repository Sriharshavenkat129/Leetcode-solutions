class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean isMatched=true;
        int r=mat.length,c=mat[0].length;
        int count_0=0,count_1=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]!=target[i][j]) {
                    isMatched=false;
                }
                if(mat[i][j]==1)count_1++;
                else count_0++;
                if(target[i][j]==1)count_1--;
                else count_0--;
            }
        }
        if(isMatched)return true;
        if(count_0!=count_1) return false;
        int[] rotated=new int[r*c];
        int index=0;
        for(int i=0;i<c;i++){
            for(int j=r-1;j>=0;j--){
                rotated[index]=mat[j][i];
                index++;
            }
        }
        isMatched=check(rotated,target);
        if(isMatched) return true;
        index=0;
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                rotated[index]=mat[i][j];
                index++;
            }
        }
        isMatched=check(rotated,target);
        if(isMatched) return true;
        index=0;
        for(int i=c-1;i>=0;i--){
            for(int j=0;j<r;j++){
                rotated[index]=mat[j][i];
                index++;
            }
        }
        isMatched=check(rotated,target);
        return isMatched;
    }
    public static boolean check(int[] arr,int [][] t){
        int index=0;
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(t[i][j]!=arr[index]) return false;
                index++;
            }
        }
        return true;
    }
}