class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minL=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                minL=Math.min(minL,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(minL==Integer.MAX_VALUE)
            minL=0;
        return minL;
    }
}