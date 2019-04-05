package sq;

import java.util.Stack;

class QueueUsingStacks 
{
	Stack<Integer> pushStack;
    Stack<Integer> popStack;
    
    /** Initialize your data structure here. */
    public QueueUsingStacks() 
    {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) 
    {
        pushStack.push(x);
    }
    
    void swap() 
    {
        if(popStack.size() <= 0) 
        {
            while(pushStack.size() > 0) 
            {
                popStack.push(pushStack.pop());
            }
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() 
    {     
        swap();        
        return popStack.pop();
    }
    
    /** Get the front element. */
    public int peek() 
    {
        swap();            
        return popStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() 
    {
        return (popStack.size() <= 0 && pushStack.size() <= 0);        
    }
    public static void main(String args[])
    {
    	QueueUsingStacks queue = new QueueUsingStacks();
    	queue.push(1);
    	queue.push(2);
    	queue.push(2);
    	int param_2 = queue.pop();
    	System.out.println(param_2);
    	int param_3 = queue.peek();
    	System.out.println(param_3);
    	boolean param_4 = queue.empty();
    	System.out.println(param_4);
    }
}


