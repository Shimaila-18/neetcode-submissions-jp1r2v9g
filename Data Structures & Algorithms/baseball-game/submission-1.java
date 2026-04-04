class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(String s : operations){
            if(s.equals("C") && !stack.isEmpty()){
                sum-=stack.pop();;
            }else if(s.equals("D")){
                stack.push(stack.peek()*2);
                sum+=stack.peek();
            }else if(s.equals("+") && !stack.isEmpty()){
                int first=stack.pop();
                int second=stack.peek();
                stack.push(first);
                stack.push(first+second);
                sum+=stack.peek();
            }else{
                stack.push(Integer.parseInt(s));
                sum+=stack.peek();
            }
        }
        // int sum=0;
        // while(!stack.isEmpty()){
        //     sum+=stack.pop();
        // }
        return sum;
    }
}