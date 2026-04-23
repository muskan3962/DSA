class MinStack {
    Stack<Long> st = new Stack<>();
    long min =-1;
    public MinStack() {
        
    }
    
    public void push(int val) {
        long x =(long)val;
        if(st.isEmpty()){
            st.push(x);
            min =x;
        }
        else if(x>=min){
            st.push(x);
        }else{
            //check mark
            st.push(2*x-min);
            // 2 ensure that always puting the less than min;
            min =x;
        }
    }
    
    public void pop() {
        if(st.isEmpty())return;
        if(st.peek()>=min)st.pop();
        else{
            long old = 2*min-st.peek();
            min = old;
            st.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty())return -1;
        long q = st.peek();
        if(q>=min){
            return (int)q;
        }
        else return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */