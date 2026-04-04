class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        List<Integer>[] freq = new List[nums.length+1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        } 
        Iterator<Map.Entry<Integer,Integer>> it = count.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry = it.next();
            freq[entry.getValue()].add(entry.getKey());
        }
        int index = 0;
        int[] res = new int[k];
        for(int i = freq.length-1;i>0 && index <k;i--){
            for(int num : freq[i]){
                res[index++]=num;
                if(index==k){
                    return res;
                }
            }
        }
        return res;
    }
}
