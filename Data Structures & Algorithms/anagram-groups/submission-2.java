class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] cArray = s.toCharArray();
            int[] freq = new int[26];
            for(char c: cArray ){
                freq[c-'a']++;
            }
            String sortedS = Arrays.toString(freq);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
