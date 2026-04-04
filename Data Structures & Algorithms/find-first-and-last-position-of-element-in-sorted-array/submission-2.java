class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length;
        int first=-1;
        int last=-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        first=l;
        l=0;r=nums.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        last=l-1;
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{first,last};
    }
}