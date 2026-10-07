//dual pivot quick sort
class Solution {
    public int[] sortArray(int[] nums) {
        dualPivotQuickSort(nums, 0, nums.length - 1);
        return nums;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void dualPivotQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int[] piv = partition(arr, low, high);
            dualPivotQuickSort(arr, low, piv[0] - 1);
            dualPivotQuickSort(arr, piv[0] + 1, piv[1] - 1);
            dualPivotQuickSort(arr, piv[1] + 1, high);
        }
    }

    static int[] partition(int[] arr, int low, int high) {
        if (arr[low] > arr[high]) {
            swap(arr, low, high);
        }
        
        int p = arr[low], q = arr[high];
        int l = low + 1, g = high - 1, k = l;

        while (k <= g) {
            if (arr[k] < p) {
                swap(arr, k, l);
                l++;
            } else if (arr[k] >= q) {
                while (arr[g] > q && k < g) {
                    g--;
                }
                swap(arr, k, g);
                g--;
                if (arr[k] < p) {
                    swap(arr, k, l);
                    l++;
                }
            }
            k++;
        }
        l--;
        g++;

        swap(arr, low, l);
        swap(arr, high, g);

        return new int[] { l, g };
    }
}