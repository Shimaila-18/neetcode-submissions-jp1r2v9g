class Solution {
    private boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int count[] = new int [26];
        for(int k = 0 ;k<s.length();k++){
            char it = s.charAt(k);
            int i = it - 'a';
            count[i] +=1;
        }
        for(int k = 0 ;k<t.length();k++){
            char it = t.charAt(k);
            int i = it - 'a';
            count[i] -=1;
        }
        for(int i = 0 ;i<26;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<String> set = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(!set.contains(strs[i])){
                    set.add(strs[i]);
            List<String> ans = new ArrayList<>();
            ans.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                   boolean op = isAnagram(strs[i],strs[j]);
                   if(op){
                    set.add(strs[j]);
                    ans.add(strs[j]);
                   }
                }
            res.add(ans);
            }
        }
        return res;
    }
}
