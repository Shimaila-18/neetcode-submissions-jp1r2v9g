class Solution {
    public int majorityElement(int[] nums) {
        // Brute force  -> O(n^2) , O(1)
        /*
        int n= nums.length;
        for(int i =0 ; i<n ;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    cnt++;
                }
            }
            if(cnt > n/2){
                return nums[i];
            }
        }
        return -1;
        */

        // Using hashmap -> O(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= nums.length;
        for(int i =0 ; i<n ;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}