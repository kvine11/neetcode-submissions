class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        int [] answer = new int[k];

        for(int i = 0; i < nums.length; i++)
        {
            if(freqMap.get(nums[i]) == null)
            {
                freqMap.put(nums[i], 1);
            }
            else
            {
                freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
            }
        }

        //+1 to ensure that in case frequency is exactly the lenght of the list
        ArrayList<Integer> [] bubble = new ArrayList[nums.length + 1];

        for(int i = 0; i < bubble.length; i++)
        {
            bubble[i] = new ArrayList<>();
        }

        for(Integer n : freqMap.keySet())
        {
            bubble[freqMap.get(n)].add(n);
        }

        int index = 0;
        for(int i = bubble.length - 1; i > 0; i--)
        {
            for(int j = 0; j < bubble[i].size(); j++)
            {
                answer[index] = bubble[i].get(j);
                if(index == k -1 )
                {
                    return answer;
                }
                index++;
            }
        }


        return answer;
    }
}
