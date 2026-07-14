class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] array = {0,1};

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            int currNum = nums[i];
            int diff = target - currNum;
            if(h.get(diff) != null)
            {
                array[0] = Math.min(i, h.get(diff));
                array[1] = Math.max(i, h.get(diff));
                return array;
            }
            h.put(currNum, i);
        }
        return array;
    }
}
