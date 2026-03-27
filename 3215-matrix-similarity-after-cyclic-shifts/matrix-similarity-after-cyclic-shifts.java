class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        k%=mat[0].length;
 //       int col=0;
        for(int i=0;i<mat.length;i++){
            int [] arr=new int[mat[0].length];
            if(i%2==0){
                int index=0;
                for(int j=k;j<mat[0].length;j++){
                    arr[index]=mat[i][j];
                    index++;
                }
                for(int j=0;j<k;j++){
                    arr[index]=mat[i][j];
                    index++;
                }
            }
            else{
                int index=0;
                for(int j=mat[0].length-k;j<mat[0].length;j++){
                    arr[index]=mat[i][j];
                    index++;
                }
                for(int j=0;j<mat[0].length-k;j++){
                    arr[index]=mat[i][j];
                    index++;
                }
            }
            System.out.println(Arrays.toString(arr));
            if(!match(mat[i],arr)) return false;
         //   col++;
        }
        return true;
    }
    public static boolean match(int[] arr1,int [] arr2){
        for(int i=0;i<arr1.length;i++)if(arr1[i]!=arr2[i])return false;
        return true;
    }
}