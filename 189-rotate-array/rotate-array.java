class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0) return;
        // if(k<=nums.length/2){ 
        // for(int i=0;i<k;i++){
        //     int temp=nums[i];
        //     nums[i]=nums[nums.length-k+i];
        //     nums[nums.length-k+i]=temp;
        // }
        // }
        // if(k==nums.length/2) return
        // int st=0,end=0; 
        // else if(k>nums.length/2){

        // }
        // System.out.println(nums);
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);
    }
    public static void reverse(int[] arr,int start,int end){
            System.out.println(start);
            System.out.println(end);
            System.out.println((start+end)/2);
            for(int i=start;i<(start+end)/2;i++){
                int temp=arr[i];
                arr[i]=arr[(start+end)-1-i];
                arr[(start+end)-1-i]=temp;
        }
    }
}