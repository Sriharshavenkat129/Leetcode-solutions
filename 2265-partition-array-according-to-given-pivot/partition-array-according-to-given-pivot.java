class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      /*  for(int i=0;i<nums.length;i++){
   //         int ele=nums[i];
            if(nums[i]>pivot){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]<=pivot){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
            }
        }
        return nums;
        */
        /*
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        int pivot_count=0;
        for(int num:nums){
            if(num<pivot)list1.add(num);
            else if(num>pivot)list2.add(num);
            else pivot_count++;
        }
        int index=0;
        for(int num:list1){
            nums[index]=num;
            index++;
        }
        for(int i=0;i<pivot_count;i++){
            nums[index]=pivot;
            index++;
        }
        for(int num:list2){
            nums[index]=num;
            index++;
        }
        return nums;
        */
        int [] res=new int[nums.length];
        int left=0,right=nums.length-1;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                res[left]=nums[i];
                left++;
            }
            if(nums[j]>pivot){
                res[right]=nums[j];
                right--;
            }
        }
        while(left<=right){
            res[left]=pivot;
            left++;
        }
        return res;
    }
}