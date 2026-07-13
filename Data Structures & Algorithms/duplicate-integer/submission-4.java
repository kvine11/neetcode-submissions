class Solution {
    public boolean hasDuplicate(int[] nums) {
        // hashset cannot contain duplicates
        // hashset do not have speicfic order

        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            if (h.add(currNum) == false) {
                return true;
            }
        }
        return false;
    }
}