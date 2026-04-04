class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> freq[] = new List[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int result[]=new int[k];
        int index=0;
        for(int i=nums.length;i>=0;i--){
            for(int num:freq[i]){
                result[index++]=num;
                if(index==k){
                    return result;
                }
            }
        }
        return result;
        
    }
}
