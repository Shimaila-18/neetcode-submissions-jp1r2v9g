class Solution {
    public boolean isPalindrome(String str) {
        char[] s = str.toCharArray();
        int i = 0;
        int j = s.length-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s[i])){
                i++;
            }
            else if(!Character.isLetterOrDigit(s[j])){
                j--;
            }else{
            if(Character.toLowerCase(s[i]) != Character.toLowerCase(s[j])){
                return false;
            }
            i++;
            j--;
            }
        }
        return true;
}
}
