class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        List<List<Integer>> list = new ArrayList<>();

        while (index < nums.length) {
            int beg = index + 1;
            int end = nums.length - 1;

            while (beg < end) {
                if (nums[beg] + nums[end] > -nums[index]) {
                    end--;
                } else if (nums[beg] + nums[end] < -nums[index]) {
                    beg++;
                } else if (nums[beg] + nums[end] == -nums[index]) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[beg]);
                    triplet.add(nums[index]);
                    triplet.add(nums[end]);
                    if (list.contains(triplet) == false) {
                        list.add(triplet);
                    }
                    beg++;
                    end--;
                }
            }
            index++;
        }

        return list;
    }
}
