class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();
        for(int it: nums){
            if(seen.contains(it)){
                return true;
            }
            else{
                seen.add(it);
            }
        }
        return false;
    }
}
