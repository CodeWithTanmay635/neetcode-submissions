class Solution {
    public void sortColors(int[] nums) {
        int low = 0; int mid = 0; int hig = nums.length - 1;
        while(mid <= hig){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,hig);
                hig--;
            }
        }
    }
    public static void swap(int[] arr, int low, int mid){
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }
}