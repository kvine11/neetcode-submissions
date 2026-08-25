class Solution {
    public int search(int[] nums, int target) {
        int beg = 0;
        int end = nums.length -1;

        while(beg <= end)
        {
            int mid = (beg + end) / 2;

            if(nums[mid] > target)
            {
                end = mid -1;
            }
            
            if(nums[mid] < target)
            {
                beg = mid + 1;
            }

            if(nums[mid] == target)
            {
                return mid;
            }
        }

        return -1;
    }
}
