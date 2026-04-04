class Solution {
    public void rotate(int[] nums, int k) {
        // 1. brute force 2 loops O(n*k), O(1)
        // 2. Use extra array O(n), O(n)
        // 3. Reversal algo : rev full array, rev first K elements, then reverse last n-k
        // 4. Juggling algo

        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    void reverse(int[] nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;e--;
        }
    }
}