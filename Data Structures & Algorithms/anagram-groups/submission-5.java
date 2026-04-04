class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int count[] = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            map.putIfAbsent(Arrays.toString(count),new ArrayList<>());
            map.get(Arrays.toString(count)).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
