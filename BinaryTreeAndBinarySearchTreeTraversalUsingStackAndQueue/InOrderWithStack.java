package btnbst;

import java.util.Stack;

public class InOrderWithStack 
{
	public static void inorderIteration(TreeNode root) 
	{	    
	    if(root==null)
	        return ;
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    stack.push(root);
	 
	    while(!stack.isEmpty())
	    {
	        TreeNode top = stack.peek();
	        if(top.left!=null)
	        {
	            stack.push(top.left);
	            top.left=null;
	        }
	        else
	        {
	            System.out.print(top.val+" ");
	            stack.pop();
	            if(top.right!=null)
	            {
	                stack.push(top.right);
	            }
	        }
	    }	   
	}
}
