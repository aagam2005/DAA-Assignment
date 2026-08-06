class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        if (target > nums[high]) return high+1;
        if (target < nums[low]) return low;
        if ((low == high) && (nums[low] == target)){
            return low;
        } 
        return binarySearch(nums, low, high, target);
    }

    // int binarySearch(int[] nums, int low, int high, int target){
    //     if (low > high){
    //         return -1;
    //     }
    //     int mid = low + ((high-low)/2);
    //     if (nums[mid] == target){
    //         return mid;
    //     } else if (nums[mid] > target){
    //         if (nums[mid-1] < target){
    //             return mid;
    //         }
    //         return binarySearch(nums, low, mid-1, target);
    //     } else {
    //         if (nums[mid+1] > target){
    //             return mid+1;
    //         }
    //         return binarySearch(nums, mid+1, high, target);
    //     }
    // }

        int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high)
            return low;   // insertion position

        int mid = low + (high - low) / 2;

        if (nums[mid] == target)
            return mid;

        if (nums[mid] > target)
            return binarySearch(nums, low, mid - 1, target);

        return binarySearch(nums, mid + 1, high, target);
    }
}
