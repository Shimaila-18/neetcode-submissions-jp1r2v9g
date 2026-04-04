class Solution {
    public String decodeString(String s) {
        Stack<String> strstack=new Stack<>();
        Stack<Integer> countstack=new Stack<>();
        int num=0;
        String curr="";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else if(c=='['){
                countstack.push(num);
                strstack.push(curr);
                curr="";
                num=0;
            }else if(c==']'){
                int repeat=countstack.pop();
                StringBuilder temp=new StringBuilder(strstack.pop());
                for(int i=0;i<repeat;i++){
                    temp.append(curr);
                }
                curr=temp.toString();
            }else{
                curr+=c;
            }
        }
        return curr;
    }
}