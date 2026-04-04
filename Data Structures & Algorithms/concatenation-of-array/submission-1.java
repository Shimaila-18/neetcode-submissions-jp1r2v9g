class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int [] result = new int[2*l];
        for(int i=0;i<l;i++){
            result[i] = nums[i];
            result[i+l] = nums[i];
        }
        return result;
    }
}