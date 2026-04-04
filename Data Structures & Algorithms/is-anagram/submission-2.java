class Solution {
    public boolean isAnagram(String s, String t) {
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
}
