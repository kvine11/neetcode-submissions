class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] output = new int[nums.length];
        int [] prefix = new int [nums.length];
        int [] postfix = new int[nums.length];

        for(int i = 0; i < prefix.length; i++)
        {
            if(i == 0)
            {
                prefix[i] = 1;
            }
            else
            {
               prefix[i] =prefix[i -1] * nums[i-1];
            }
            System.out.println(prefix[i]);
        }

        for(int i = postfix.length - 1; i >= 0; i--)
        {
            if(i == postfix.length -1)
            {
                postfix[i] = 1;
            }
            else
            {
                postfix[i] = nums[i + 1] * postfix[i + 1];
            }
            System.out.println(postfix[i]);
        }

        for(int i = 0; i < output.length; i++)
        {
            output[i] = postfix[i]  *prefix[i];
        }

        return output;

        


    }
}  
