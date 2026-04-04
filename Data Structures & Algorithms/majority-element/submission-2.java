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

        // Using hashmap -> O(n), O(n)
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= nums.length;
        for(int i =0 ; i<n ;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
        */

        // Optimal -> moore's voting algo

        int el=-1;
        int cnt =0;
        for(int n  : nums){
            if(cnt==0){
                el=n;
                cnt++;
            }else if(n==el){
                cnt++;
            }else{
                cnt--;
            }
        }
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(el==nums[i]){
                count++;
            }
        }
        if(count>nums.length/2){
            return el;
        }else{
            return -1;
        }
    }
}