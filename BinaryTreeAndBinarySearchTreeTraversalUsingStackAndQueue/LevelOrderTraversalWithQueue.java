package btnbst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversalWithQueue 
{
	public static void levelOrderTraversal(TreeNode root) 
	{
		Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();        
        if (root == null) 
            return ;         
        s1.push(root);        
        while (!s1.empty() || !s2.empty()) 
        {                    
            while (!s1.empty()) 
            {
                TreeNode temp = s1.pop();
                System.out.print(temp.val+" ");
                if (temp.left != null) 
                {
                    s2.add(temp.left);
                }                
                if (temp.right != null) 
                {
                    s2.add(temp.right);
                }
            }                     
            while (!s2.empty()) 
            {
                TreeNode temp = s2.pop();
                System.out.print(temp.val+" ");
                if (temp.right != null) 
                {
                    s1.add(temp.right);
                }                
                if (temp.left != null) 
                {
                    s1.add(temp.left);
                }
            }      
        }        
	}
}
