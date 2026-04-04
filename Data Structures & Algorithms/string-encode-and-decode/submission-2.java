class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String str : strs){
            s.append(str.length()).append("#").append(str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            StringBuilder num = new StringBuilder("");
            while(str.charAt(i)!='#'){
                num.append(str.charAt(i));
                i++;
            }
            int cnt = Integer.parseInt(num.toString());
            i++;
            String s = str.substring(i,i+cnt);
            output.add(s);
            i=i+cnt;

        }
        return output;
    }
}
