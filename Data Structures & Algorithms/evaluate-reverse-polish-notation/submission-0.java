class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String str : tokens){
            if(str.equals("+")){
                int first=s.pop();
                int second=s.pop();
                s.push(first+second);
            }else if(str.equals("-")){
                int first=s.pop();
                int second=s.pop();
                s.push(second-first);
            }else if(str.equals("*")){
                int first=s.pop();
                int second=s.pop();
                s.push(second*first);
            }else if(str.equals("/")){
                int first=s.pop();
                int second=s.pop();
                s.push(second/first);
            }else{
                s.push(Integer.parseInt(str));
            }
        }
        return s.pop();
    }
}
