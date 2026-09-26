class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static int[] quickSort(int[] arr, int l, int h){
        if(l < h){
            int partition = partition(arr, l , h);
            quickSort(arr, l, partition - 1);
            quickSort(arr, partition + 1, h);
            return arr;
        }
        return arr;
    }
    public static int partition(int[] arr, int l, int h){
        int pivot = arr[l];
        int i = l;
        int j = h;
        while(i < j){
            while(i <= h && arr[i] <= pivot){
                i++;
            }
            while(j >= l && arr[j] > pivot){
                j--;
            }
            if( i < j) swap(arr, i, j);
        }
        swap(arr, l, j);
        return j;
    }

        static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}