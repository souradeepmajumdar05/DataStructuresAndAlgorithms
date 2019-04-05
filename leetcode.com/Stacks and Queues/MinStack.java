package sq;

import java.util.Stack;

public class MinStack 
{
    public int min = Integer.MAX_VALUE;
    public Stack<Integer> stack = new Stack<Integer>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if (x<=min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.pop() == min) {
            min=stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
    
    public static void main(String args[])
    {
    	MinStack minStack = new MinStack();
    	minStack.push(1);
    	minStack.push(12);
    	minStack.push(0);
    	minStack.push(-1);
    	int param_3 = minStack.top();
    	System.out.println(param_3);
    	minStack.pop();
    	int param_4 = minStack.getMin();
    	System.out.println(param_4);
    }
}
