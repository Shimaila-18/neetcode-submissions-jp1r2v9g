class Solution {
    public String longestCommonPrefix(String[] strs) {

        for(int i=0;i<strs[0].length();i++){
            for(String s : strs){
                if(i==s.length() || s.charAt(i)!=strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];

        

        /*
        Brute force (Horizontal scanning)
        TC -> O(n*m)
        SC -> O(1)

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
        */
    }
}