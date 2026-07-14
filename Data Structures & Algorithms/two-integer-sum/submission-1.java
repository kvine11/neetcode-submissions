class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] array = {0,1};
        
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
          int currNum = nums[i];
          int diff = target - currNum;
          if(h.get(diff) != null)
          {
            array[0] = h.get(diff);
            array[1] = i;
            return array; 
          }
          else
          {
            h.put(currNum, i);
          }
        }
        return array;
    
    }
}
