class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int maxLength = 0;

        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }

        for(Integer n : set)
        {
            if(!set.contains(n - 1))
            {
                int length = 0;
                while(set.contains(n + length))
                {
                    length++;
                }
                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;
    }
}
