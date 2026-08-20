class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int [temperatures.length];

        for(int i = 0; i < temperatures.length; i++)
        {
            int currTemp = temperatures[i];
            
            for(int j = i + 1; j < temperatures.length;j++)
            {
                int nextTemp = temperatures[j];
                if(currTemp < nextTemp)
                {
                    res[i] = j - i;
                    break;
                }
            }
        }

        return res;
    }
}
