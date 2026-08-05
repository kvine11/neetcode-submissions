class MinStack {

    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Iterator value = stack.iterator();
        int min = stack.peek();

        while(value.hasNext())
        {
            min = Math.min(min, (int) value.next());
        }

        return min;
    }
}
