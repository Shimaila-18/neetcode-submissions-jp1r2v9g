class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int maxWater=0;
        while(start<end){
            maxWater=Math.max(maxWater,((end-start)*(Math.min(heights[start],heights[end]))));
            if (heights[start] <= heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }
}
