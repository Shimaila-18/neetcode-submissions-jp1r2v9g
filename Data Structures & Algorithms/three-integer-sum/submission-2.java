class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int ele = -1*nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==ele){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    int curr = nums[j];
                    while(j<k && nums[j]==curr){
                        j++;
                    }
                    curr = nums[k];
                    while(j<k && nums[k]==curr){
                        k--;
                    }
                }else if(nums[j]+nums[k]<ele){
                    j++;
                }else{
                    k--;
                }
            }
        }
            return ans;
    }
}
