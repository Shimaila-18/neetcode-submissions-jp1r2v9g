class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char brackets [] = s.toCharArray();

        for(char it : brackets){
            if(it == '(' || it=='[' || it =='{' || stack.isEmpty()){
                stack.push(it);
            }else{
                if(it == ')'){
                    char currTop = stack.pop();
                    if(currTop != '('){
                        return false;
                    }
                }else if(it==']'){
                    char currTop = stack.pop();
                    if(currTop != '['){
                        return false;
                    }
                }else{
                    char currTop = stack.pop();
                    if(currTop != '{'){
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
