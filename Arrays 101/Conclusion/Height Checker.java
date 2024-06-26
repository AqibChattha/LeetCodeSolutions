class Solution {
    public int heightChecker(int[] heights) {
        int[] original = heights.clone();
        Arrays.sort(heights);
        int output = 0;
        for(int i = 0; i < heights.length; i++)
        {
            if(heights[i] != original[i]) output++;
        }
        return output;
    }
}
