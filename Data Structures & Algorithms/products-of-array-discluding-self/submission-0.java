class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] output = new int [nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            int product = 1;
            for(int j = i + 1; j < nums.length; j++)
            {
                product = product * nums[j];
            }
            if(i != 0)
            {
                for(int k = 0; k < i; k++)
                {
                    product = product * nums[k];
                }
            }
            output[i] = product;
        }
        return output;

    }
}  
