class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = strs[0];
        for(int i=1;i<strs.length;i++){
            int j;
            for(j=0;j<Math.min(longest.length(),strs[i].length());j++){
                if(longest.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            longest = strs[i].substring(0,j);
        }
        return longest;
    }
}