class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>[] freq = new List[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry entry : map.entrySet()){
            freq[(int)(entry.getValue())].add((int)(entry.getKey()));
        }
        int []output = new int[k];
        for(int i = freq.length-1 ;i>=0;i--){
            for(int n : freq[i]){
                if(k==0){
                    return output;
                }
                output[k-1]=n;
                k--;
            }
        }
        return output;
        

    }
}
