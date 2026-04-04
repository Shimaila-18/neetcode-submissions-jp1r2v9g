class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        Iterator<Map.Entry<Integer,Integer>> it = count.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry = it.next();
            heap.offer(new int[] {entry.getValue(), entry.getKey()});
            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = heap.poll()[1];
        }
        return res;
    }
}
