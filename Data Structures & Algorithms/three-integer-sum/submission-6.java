class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();
        Arrays.sort(nums);

        int index = 0;
        while(index < nums.length)
        {
            int left = index + 1;
            int right = nums.length - 1;

            while(left < right)
            {
                if(-nums[index] > nums[left] + nums[right])
                {
                    left++;
                }
                else if(-nums[index] < nums[left] + nums[right])
                {
                    right--;
                }
                else
                {
                    ArrayList<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[index]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    if(!sums.contains(triplet))
                    {
                        sums.add(triplet);
                    }
                    left++;
                    right--;
                }
            }
            index++;
        }

        return sums;
    }
}
