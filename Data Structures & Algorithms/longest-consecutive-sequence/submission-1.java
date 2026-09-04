class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        int minLength = 0;

        for (Integer n : set) {
            if (!set.contains(n - 1)) {
                int length = 0;
                while (set.contains(n + length)) {
                    length++;
                }
                minLength = Math.max(minLength, length);
            }
        }

        return minLength;
    }
}
