class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int l=s.length();
        int ans=0;
        boolean visited[]=new boolean[256];
        for(int r=0;r<l;r++){

            while(visited[s.charAt(r)]==true){
                visited[s.charAt(left)]=false;
                left++;
            }
            visited[s.charAt(r)]=true;
            ans=Math.max(ans,r-left+1);

        }
        return ans;
    }
}
