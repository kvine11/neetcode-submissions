class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int beg = 0;
        int end = numbers.length  - 1;
        int [] answer = {0,1};

        int sum = numbers[beg] + numbers[end];

        while(beg < end)
        {
            if(sum > target)
            {
                end--;
            }

            else if(sum < target)
            {
                beg++;
            }
            else
            {
                answer[0] = beg + 1;
                answer[1] = end + 1;
                return answer;
            }
            sum = numbers[beg] + numbers[end];
        }

        return answer;
    }
}
