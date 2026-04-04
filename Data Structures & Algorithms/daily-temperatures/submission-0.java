class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[temperatures.length];
        for(int r=0;r<temperatures.length;r++){
            while(!s.isEmpty() && temperatures[s.peek()] <temperatures[r]){
                ans[s.peek()]=r-s.peek();
                s.pop();
            }
            s.push(r);
        }
        return ans;
    }
}
