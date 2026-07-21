class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int currArea = 1;
        int firstBucket = 0;
        int lastBucket = heights.length - 1;

        while (firstBucket < lastBucket) {
            currArea =
                (lastBucket - firstBucket) * Math.min(heights[lastBucket], heights[firstBucket]);
            maxArea = Math.max(currArea, maxArea);
            if (heights[firstBucket] < heights[lastBucket]) {
                firstBucket++;
            }
            else{
                lastBucket--;
            }
        }

        return maxArea;
    }
}
