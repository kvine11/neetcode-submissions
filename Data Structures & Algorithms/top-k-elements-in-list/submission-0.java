class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // use hashmap to keep track of frequency
        HashMap<Integer, Integer> numFrequency = new HashMap<Integer, Integer>();
        int[] answer = new int[k];
        ArrayList<Integer>[] arr = new ArrayList[nums.length + 1];

        for (int i = 0; i < nums.length + 1; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        // count frequency of each number
        for (int i = 0; i < nums.length; i++) {
            if (numFrequency.get(nums[i]) == null) {
                numFrequency.put(nums[i], 1);
            } else {
                numFrequency.put(nums[i], numFrequency.get(nums[i]) + 1);
            }
        }

        //populate new array
        for(Integer n : numFrequency.keySet())
        {
            arr[numFrequency.get(n)].add(n);
        }

        System.out.println( Arrays.toString(arr));

        //process new array
        int index = 0;
        for(int i = arr.length - 1; i > 0; i--)
        {
            if(arr[i] != null)
            {
                for(int j = 0; j < arr[i].size(); j++)
                {
                    answer[index] = arr[i].get(j);
                    if(index == k -1)
                    {
                        return answer;
                    }
                    index++;
                }
            }
        }

        // int index = 0;
        // for(int i = arr.length -1; i > 0; i--)
        // {
        //     for(int n : arr[i])
        //     {
        //         answer[index + 1] = n;
        //     }
        //     if(index == k)
        //     {
        //         return answer;
        //     }
        // }

        return answer;

    }
}
