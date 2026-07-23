class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int num3 = nums[k];
                    ArrayList<Integer> triplets = new ArrayList<>();
                    triplets.add(num1);
                    triplets.add(num2);
                    triplets.add(num3);
                    if (num1 + num2 + num3 == 0 && list.contains(triplets) == false) {    
                        list.add(triplets);
                    }
                }
            }
        }

        return list;
    }
}
