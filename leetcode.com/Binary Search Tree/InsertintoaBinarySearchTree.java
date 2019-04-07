package bst;

public class InsertintoaBinarySearchTree 
{
	public TreeNode insertIntoBST(TreeNode root, int val) 
	{
		if (root == null) 
		{
			root = new TreeNode(val);
			return root;
		}

		if (root.val < val) 
		{
			root.right = insertIntoBST(root.right, val);
		}

		if (root.val > val) 
		{
			root.left = insertIntoBST(root.left, val);
		}

		return root;
	}
}
