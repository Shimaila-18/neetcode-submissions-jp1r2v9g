class StockSpanner {
    Stack<int[]> s;
    public StockSpanner() {
        s = new Stack<>();
    }
    
    public int next(int price) {
        if(s.isEmpty()){
            s.push(new int[] {price,1});
            return 1;
        }
        int days=1;
        while(!s.isEmpty() && s.peek()[0]<=price){
            days+=s.peek()[1];
            s.pop();
        }
        s.push(new int[] {price,days});
        return days;


    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */