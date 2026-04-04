class Solution {
    public boolean isAnagram(String s, String t) {
        int count[] = new int [26];
        for(char it : s.toCharArray()){
            int i = it - 'a';
            count[i] +=1;
        }
        for(char it : t.toCharArray()){
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
