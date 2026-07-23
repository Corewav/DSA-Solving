// Last updated: 7/23/2026, 9:35:15 AM
class MinStack {
    Stack<Integer>stack;
    Stack<Integer>minstack;
    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(minstack.isEmpty() || value<=minstack.peek()){
            minstack.push(value);
        }
    }
    
    public void pop() {
        int popvalue=stack.pop();
        if(popvalue==minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}