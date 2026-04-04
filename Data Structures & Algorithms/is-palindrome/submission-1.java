class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j){
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(j));
            if(!((c1>='a' && c1<='z') || (c1>='0' && c1<='9'))){
                i++;
            }else if(!((c2>='a' && c2<='z') || (c2>='0' && c2<='9'))){
                j--;
            }else{
                if(c1==c2){
                    i++;j--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
