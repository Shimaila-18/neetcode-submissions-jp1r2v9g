class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char brackets [] = s.toCharArray();

        for(char it : brackets){
            if(it == '(' || it=='[' || it =='{' || stack.isEmpty()){
                stack.push(it);
            }else{
                char currTop = stack.pop();
                if(it == ')' && currTop != '(' || 
                it==']' && currTop != '[' ||
                it=='}' && currTop!='{'
                )
                    return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
