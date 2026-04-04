class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][] withIndex = new int[nums.length][2];
        for(int i = 0 ;i< nums.length;i++){
            withIndex[i][0]=nums[i];
            withIndex[i][1]=i;
        }
        Arrays.sort(withIndex, Comparator.comparingInt(a -> a[0]));

        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if(withIndex[i][0]+withIndex[j][0] == target){
                return new int[]{
                    Math.min(withIndex[i][1],withIndex[j][1]),
                    Math.max(withIndex[i][1],withIndex[j][1])
                };
            }
            else if(withIndex[i][0]+withIndex[j][0]<target){
                i++;
            }else{
                j--;
            }
        }
        return new int[0];
    }
}
