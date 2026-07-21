class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] answer = {0,1};
        int beg = 0;
        int end = numbers.length - 1;
        int sum = numbers[beg] + numbers[end];

        while(beg < end)
        {
            while(beg < end && sum > target)
            {
                end--;
                sum = numbers[beg] + numbers[end];
            }

            while(beg < end && sum < target)
            {
                beg++;
                sum = numbers[beg] + numbers[end];
            }

            if(sum == target)
            {
                answer[0] = beg + 1;
                answer[1] = end + 1;
                return answer;
            }
        }
        return answer;
    }
}
