class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        for(int w : weights){
            l=Math.max(l,w);
            r+=w;
        }
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(weights,days,mid)){
                ans=Math.min(ans,mid);
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] weights, int days,int c){
        int totalDays=1;
        int curr=0;
        for(int w:weights){
            if(curr+w>c){
                curr=w;
                totalDays++;
                if(totalDays>days){
                    return false;
                }
            }else{
                curr+=w;
            }
        }

        return totalDays<=days;
    }
}