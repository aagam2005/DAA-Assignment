class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        return bS(nums, target, low, high);
    }
    int bS(int[] nums, int target, int low, int high){
        if (low>high)
            return -1;
        int mid = low + (high-low)/2;
        if(nums[mid] == target)
            return mid;
        else if(nums[low] <= nums[mid]){
            if(target >= nums[low] && target <nums[mid])
                return bS(nums, target, low, mid-1);
            else
                return bS(nums, target, mid+1, high);
        } else{
            if(target >nums[mid] && target <= nums[high])
                return bS(nums, target, mid+1, high);
            else
                return bS(nums, target, low, mid-1);
        }
    }
}
