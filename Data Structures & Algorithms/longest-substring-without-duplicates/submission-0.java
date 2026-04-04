class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int l=0;
        int r=0;
        int ML = 0;
        while(r<arr.length){
            char c = arr[r];
            if(map.containsKey(c)){
                int index = map.get(c);
                if(index>=l){
                l=index+1;
                }
            }
            map.put(c,r);
            ML= Math.max(ML,r-l+1);
            r++;
        }
        return ML;
    }
}
