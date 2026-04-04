class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int it: nums){
            if(map.containsKey(it)){
                return true;
            }
            else{
                map.put(it,1);
            }
        }
        return false;
    }
}
