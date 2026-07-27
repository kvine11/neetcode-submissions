class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (h.get(nums[i]) == null) {
                h.put(nums[i], 1);
            } else {
                h.put(nums[i], h.get(nums[i]) + 1);
            }
        }

        ArrayList<Integer>[] ans = new ArrayList[nums.length + 1];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            ans[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];
        for (int i = ans.length - 1; i > 0; i--) {
            for (int j = 0; j < ans[i].size(); j++) {
                res[index] = ans[i].get(j);
                if (index == k - 1) {
                    return res;
                }
                index++;
            }
        }
        return res;
    }
}
