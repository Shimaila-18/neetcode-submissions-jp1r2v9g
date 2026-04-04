class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        for(Character c:str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                char top=s.pop();
                if(c == ')' && top != '(')
                    return false;

                if(c == '}' && top != '{')
                    return false;

                if(c == ']' && top != '[')
                    return false;
            }
        }
        return s.isEmpty();
    }
}
