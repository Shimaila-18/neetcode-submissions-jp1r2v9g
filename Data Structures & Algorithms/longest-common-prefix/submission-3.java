class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            int j;
            for(j=0;j<prefix.length() && j< strs[i].length();j++){
                if(strs[i].charAt(j)!=prefix.charAt(j)){
                    break;
                }
            }
            prefix= prefix.substring(0,j);
        }
        return prefix;
    }
}