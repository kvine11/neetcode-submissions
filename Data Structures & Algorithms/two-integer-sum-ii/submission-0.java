class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int beg = 0;
        int end = numbers.length - 1;
        int [] arr = {0,1};
        int sum =numbers[beg] + numbers[end];

        while(beg < end)
        {

            while(sum < target && beg < end)
            {
                beg++;
                sum = numbers[beg] + numbers[end];
            }

            while(sum > target && beg < end)
            {
                end--;
                sum = numbers[beg] + numbers[end];
            }

            if(target == sum)
            {
                arr[0] = beg + 1;
                arr[1] = end + 1;
                return arr; 
            }
        }

        return arr;

    }
}
