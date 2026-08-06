class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    void mergeSort(int[] arr, int l, int h) {
        if (l >= h)
            return;
        int mid = (l + h) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, h);
        merge(arr, l, mid, h);
    }
    void merge(int[] arr, int l, int mid, int h) {
        int i = l;
        int j = mid + 1;
        int k = 0;
        int[] result = new int[h - l + 1];
        while (i <= mid && j <= h) {
            if (arr[i] <= arr[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            result[k++] = arr[i++];
        }
        while (j <= h) {
            result[k++] = arr[j++];
        }
        k = 0;
        for (i = l; i <= h; i++) {
            arr[i] = result[k++];
        }
    }
    // public int[] sortArray(int[] nums) {
    //     quickSort(nums, 0, nums.length - 1);
    //     return nums;
    // }
    // void quickSort(int[] arr, int low, int high){
    //     if(low>=high){
    //         return;
    //     }
    //     int index = partition(arr, low, high);
    //     quickSort(arr, low, index-1);
    //     quickSort(arr, index+1, high);
    // }

    // int partition(int[] arr, int low, int high){
    //     int i = low, j = high, pivot = arr[low];

    //     while(i <= j){
    //         while (i<=high && arr[i] <= pivot){
    //             i++;
    //         }
    //         while (j>0 && arr[j] > pivot){
    //             j--;
    //         }

    //         if(i<j){
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }

    //     int temp = arr[j];
    //     arr[j] = arr[low];
    //     arr[low] = temp;
    //     return j;
    // }
}
