class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int r=0;
        int ans=0;
        while(r<nums.length){
            if(nums[r]==1){
                ans=Math.max(ans,r-l+1);
                r++;
            }
            while(r<nums.length && nums[r]==0){
                l=r+1;
                r++;
            }
        }
        return ans;
    }
}