class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int ans=0;
        int end=0,start=weights[0];
        for(int n:weights){
            end+=n;
            start=Math.max(start,n);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            int day=getDays(weights,mid);
            if(day>days){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public static int getDays(int[] arr,int max){
        int days=0,sum=0;
        for(int i:arr){
            sum+=i;
            if(sum>max){
                days++;
                sum=i;
            }
        }
        days++;
        return days;
    }
}