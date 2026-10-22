class MinStack {

    private Stack <Integer> stack;
    private Stack <Integer> minimums;

    public MinStack() {
        stack = new Stack<>(); 
        minimums = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if (minimums.isEmpty()){
            minimums.push(val);
        }
        else {
            int previous1 = minimums.peek();
            int min1 = Math.min (val, previous1);
            minimums.push(min1);


        }
        
    }
    
    public void pop() {
        stack.pop(); 
        minimums.pop(); 

    }
    
    public int top() {
        return stack.peek();

    }
    
    public int getMin() {
        return minimums.peek(); 
        
    }
}
