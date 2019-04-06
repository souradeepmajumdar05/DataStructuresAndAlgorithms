package btnbst;

import java.util.Stack;

public class PreOrderWithStack 
{
	public static void preorderIteration(TreeNode root) 
	{
        if(root == null)
            return;
 
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
 
        while(!stack.empty())
        {         
            TreeNode n = stack.pop();
            System.out.printf("%d ",n.val);          
            if(n.right != null)
            {
                stack.push(n.right);
            }
            if(n.left != null)
            {
                stack.push(n.left);
            } 
        }        
    }
}
