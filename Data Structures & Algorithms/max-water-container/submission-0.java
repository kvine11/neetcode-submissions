class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int currArea = 1;
        for (int i = 0; i < heights.length; i++) {
            int width = 1;

            for (int j = i + 1; j < heights.length; j++) {
                currArea = width * Math.min(heights[i], heights[j]);
                maxArea = Math.max(currArea, maxArea);
                width++;
            }
        }

        return maxArea;
    }
}
