class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        int [] answer = new int [k];
        //establish frequencies
        for(int i = 0; i < nums.length; i++)
        {
            if(frequencyMap.get(nums[i]) == null)
            {
                frequencyMap.put(nums[i], 1);
            }
            else
            {
                frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
           }
        }

        //create bucket sort array
        ArrayList<Integer> [] arr = new ArrayList[nums.length + 1];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = new ArrayList<Integer>();
        }

        //map values to bucket sort array
        for(Integer n: frequencyMap.keySet())
        {
            arr[frequencyMap.get(n)].add(n);
        }

        //find topK elements
        int index = 0;
        for(int i = arr.length - 1; i > 0; i--)
        {
            for(int j = 0; j < arr[i].size(); j++)
            {
                answer[index] = arr[i].get(j);
                if(index == k - 1)
                {
                    return answer;
                }
                index++;
            }
        }
        return answer;
    }
}
