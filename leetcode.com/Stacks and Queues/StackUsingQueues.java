package sq;

import java.util.ArrayList;

public class StackUsingQueues 
{
	/** Initialize your data structure here. */
    ArrayList<Integer> arrayNew = new ArrayList<>();
    ArrayList<Integer> arrayOld = new ArrayList<>();


    /** Push element x onto stack. */
    public void push(int x) 
    {
        arrayOld.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() 
    {
        for (int i=0;i<=arrayOld.size()-1;i++) 
        {
            arrayNew.add(arrayOld.get(i));
        }
        int k = arrayNew.get(arrayNew.size()-1);
        arrayNew.remove(arrayNew.indexOf(k));

        arrayOld.clear();
        return k;
    }

    /** Get the top element. */
    public int top() 
    {
        for (int i=0;i<=arrayOld.size()-1;i++) 
        {
            arrayNew.add(arrayOld.get(i));
        }
        int k = arrayNew.get(arrayNew.size()-1);

        arrayOld.clear();
        return k;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() 
    {
        return arrayNew.size() == 0 && arrayOld.size() == 0;
    }
    
    public static void main(String args[])
    {
    	StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
    	int param_2 = stack.pop();
    	System.out.println(param_2);
    	int param_3 = stack.top();
    	System.out.println(param_3);
    	boolean param_4 = stack.empty();
    	System.out.println(param_4);
    }
}
