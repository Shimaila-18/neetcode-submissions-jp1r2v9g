class Solution {
    public boolean hasDuplicate(int[] nums) {
        // set
        // hashmap
       return Arrays.stream(nums).distinct().count() < nums.length;
    }
}