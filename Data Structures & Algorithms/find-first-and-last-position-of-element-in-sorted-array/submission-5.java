class Solution {
    public int[] searchRange(int[] nums, int target) {        
        int start = bound(nums,target,nums.length);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        int end = bound(nums,target+1,nums.length)-1;
        return new int[]{start,end};
    }

    private int bound(int[] nums,int target,int n){
        int l=0,r=n;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}