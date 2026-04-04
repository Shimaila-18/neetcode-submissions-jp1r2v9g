class Solution {
    public int removeElement(int[] nums, int val) {
        int pos = 0;
        int i = 0;
        while(i<nums.length){
            if(val != nums[i]){
                nums[pos++]=nums[i];
            }
            i++;
        }
        return pos;
    }
}