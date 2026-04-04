class MinStack {
    Stack<Integer> normal;
    Stack<Integer> minimum;

    public MinStack() {
        normal=new Stack<>();
        minimum=new Stack<>();
    }
    
    public void push(int val) {
        normal.push(val);
        if(minimum.isEmpty() || (!minimum.isEmpty() && val<=minimum.peek())){
            minimum.push(val);
        }
    }
    
    public void pop() {
        int popped = normal.pop();
        if(!minimum.isEmpty() && popped==minimum.peek()){
            minimum.pop();
        }
    }
    
    public int top() {
        return normal.peek();
    }
    
    public int getMin() {
        return minimum.peek();
    }
}
