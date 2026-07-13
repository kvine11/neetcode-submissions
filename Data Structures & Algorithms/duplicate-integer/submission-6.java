class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            if(h.add(nums[i]) == false)
            {
                return true;
            }
        }
        return false;
    }
}