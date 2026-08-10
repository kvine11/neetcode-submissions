class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] pre = new int[nums.length];
        int [] post = new int[nums.length];
        int [] ans = new int[nums.length];

        for(int i = 0; i < pre.length; i++)
        {
            if(i == 0)
            {
                pre[i] = 1;
            }
            else{
                pre[i] = nums[i - 1] * pre[i - 1];
            }
        }

        for(int i = post.length - 1; i >= 0; i--)
        {
            if(i == post.length -1)
            {
                post[i] = 1;
            }
            else{
                post[i] = nums[i + 1] * post[i + 1];
            }
        }

        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = post[i] * pre[i];
        }

        return ans;
    }
}  
