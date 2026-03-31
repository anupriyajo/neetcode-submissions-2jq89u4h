class MinStack {
    Stack<Integer> min;
    Stack<Integer> stack;

    public MinStack() {
        min = new Stack<Integer>();
        stack = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(min.isEmpty() || min.peek()>=val)
            min.push(val);
        stack.push(val);
    }
    
    public void pop() {
        int x = stack.pop();
        if(x==min.peek()) min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
