class Solution {
    public int findDuplicate(int[] nums) {
        int ele = -1;
        for(int i=0;i<nums.length;i++){
            ele = Math.abs(nums[i]);
            int index = ele-1;
            if(nums[index]<0){
                break;
            }else{
                nums[index] = nums[index]*-1; 
            }
        }
        return ele;
    }
}
