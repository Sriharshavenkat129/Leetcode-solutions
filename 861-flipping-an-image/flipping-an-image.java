class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                image[i][j]^=1;
            }
            for(int j=0;j<image.length/2;j++){
                swap(i,j,image.length-1-j,image);
            }
        }
        return image;
    }
    public static void swap(int r,int i,int j,int[][] arr){
        int temp=arr[r][i];
        arr[r][i]=arr[r][j];
        arr[r][j]=temp;
    }
}