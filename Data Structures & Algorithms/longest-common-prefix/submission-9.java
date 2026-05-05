class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        for (int c = 0; c<strs[0].length();c++){
            char curr = strs[0].charAt(c);
            for(int i=1;i<strs.length;i++){
                if(c==strs[i].length() || strs[i].charAt(c)!=curr){
                    return strs[i].substring(0,c);
                }
            }
        }
        return strs[0];
    }
}