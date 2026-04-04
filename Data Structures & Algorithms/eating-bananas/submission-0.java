class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans=Integer.MAX_VALUE;
        int l=1;
        int r=1;
        for(int n:piles){
            r=Math.max(r,n);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,piles,h)){
                ans=Math.min(ans,mid);
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    private boolean isPossible(int k,int[] piles,int h){
        long hours =0;
        for(int n:piles){
            hours+= (n+k-1)/k;
            if(hours>h) return false;
        }
        return hours<=h;
    }
}
