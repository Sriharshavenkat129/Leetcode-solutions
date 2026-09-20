class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=intervals[i][0];
            arr[i][1]=intervals[i][1];
            arr[i][2]=i;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=getIndex(arr,intervals[i][1]);
        }
        return result;
    }
    public int getIndex(int[][] arr,int target){
        int start=0,end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid][0]>=target){
                index=arr[mid][2];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
}