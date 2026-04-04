class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int ans=0;
        int cnt=0;
        int k=1;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                cnt++;
            }
            while(cnt>k){
                if(nums[l]==0)
                    cnt--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
