class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int []freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int ans =0;
        int l=0;
        for(int r=0;r<s2.length();r++){
            while(freq[s2.charAt(r)-'a']==0){
                freq[s2.charAt(l)-'a']++;
                l++;
            }
                freq[s2.charAt(r)-'a']--;
                ans=Math.max(ans,r-l+1);
        }
        if(ans==s1.length()){
            return true;
        }else{
            return false;
        }
    }
    
}
