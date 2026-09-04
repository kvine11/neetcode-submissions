class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            if(freq.get(nums[i]) == null)
            {
                freq.put(nums[i], 1);
            }
            else
            {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
        }

        ArrayList<Integer> [] list = new ArrayList [nums.length + 1];

        for(int i = 0; i < list.length; i++)
        {
            list[i] = new ArrayList<>();
        }

        for(Integer i : freq.keySet())
        {
            list[freq.get(i)].add(i);
        }

        int [] ans = new int[k];
        int index = 0;
        for(int i = list.length- 1; i >= 0; i--)
        {
            for(int j = 0; j < list[i].size(); j++)
            {
                ans[index] = list[i].get(j);
                if(index + 1 == k)
                {
                    return ans;
                }
                index++;
            }
        }

        return ans;

    }
}
