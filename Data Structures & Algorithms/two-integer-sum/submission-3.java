class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = {0,1};
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            int currNum = nums[i];
            int diff = target - currNum;
            if(h.get((diff)) != null)
            {
                arr[0] = Math.min(h.get(diff), i);
                arr[1] = Math.max(h.get(diff), i);
                return arr;
            }
            h.put(nums[i], i);
        }
        return arr;
    }
}
