class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int n : asteroids){
                boolean destroyed=false;
                while(!s.isEmpty() && n < 0 && s.peek() > 0){
                int top=s.peek();
                    if(top<-n){
                        s.pop();
                        continue;
                    }else if(top == -n) {
                        s.pop();
                    }
                    destroyed = true;
                    break;
                }
                 if(!destroyed) {
                    s.push(n);
            }
        }
        int[] result=new int[s.size()];
        for(int i = result.length - 1; i >= 0; i--) {
            result[i] = s.pop();
        }
        return result;
    }
}