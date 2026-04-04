class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        if(l==0 || l==1){
            return l;
        }
        int ans=0;
        for (int i=0;i<l;i++){
            boolean visited[] = new boolean[256];
            for(int j=i;j<l;j++){
                if(visited[s.charAt(j)]==false){
                   ans = Math.max(ans,j-i+1); 
                   visited[s.charAt(j)]=true;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}
