package sq;

import java.util.*;
/*
 * public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
	}
 * */

public class BinaryTreeInorderTraversal 
{
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur!=null || !stack.isEmpty())
        {
            while(cur!=null)
            {
                stack.push(cur);
                cur = cur.left;
            }
            cur =stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
