class Solution {

    public String encode(List<String> strs) {
        String res="";
        for(String s : strs){
            String len = Integer.toString(s.length());
            res += (len+"#"+s);
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            String num="";
            char c = str.charAt(i);
            while(c!='#'){
                num+=c;
                i++;
                c = str.charAt(i);
            }
            i++;
            int len = Integer.parseInt(num);
            int count = 0;
            String s ="";
            while(count<len && i<str.length()){
                c = str.charAt(i);
                s+=c;
                i++;
                count++;
            }
            list.add(s);

        }
        return list;

    }
}
