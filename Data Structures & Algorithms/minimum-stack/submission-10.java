class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int min;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(!minStack.isEmpty())
        {
            min = Math.min(val, minStack.peek());

        }
        else{
            min = val;
        }
        minStack.push(min);
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
