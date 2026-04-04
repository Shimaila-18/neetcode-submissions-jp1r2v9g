class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String str : tokens){
            if ("+-*/".contains(str)){
                int first=s.pop();
                int second=s.pop();
                if(str.equals("+")){
                    s.push(first+second);
                }else if(str.equals("-")){
                    s.push(second-first);
                }else if(str.equals("*")){
                    s.push(second*first);
                }else if(str.equals("/")){
                    s.push(second/first);
                }
            }else{
                s.push(Integer.parseInt(str));
            }
        }
        return s.pop();
    }
}
