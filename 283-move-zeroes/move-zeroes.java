class Solution {
    public void moveZeroes(int[] arr) {
        int l = 0, r = 0;
        for (r = 0; r < arr.length; r++) {
            if (l < arr.length && arr[r] != 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                while (l < arr.length && arr[l] != 0)
                    l++;
                r = l;
            }
        }

    }
}