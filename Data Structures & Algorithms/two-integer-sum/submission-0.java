class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] array = {0,1};
        for(int i = 0; i < nums.length; i++)
        {
            int currNum = nums[i];
            for(int j = i + 1; j < nums.length; j++)
            {
                int pairNum = nums[j];
                if(currNum + pairNum == target)
                {
                    array[0] = Math.min(i, j);
                    array[1] = Math.max(i, j);
                    return array;
                }
            }
        }
        return array;
    }
}
