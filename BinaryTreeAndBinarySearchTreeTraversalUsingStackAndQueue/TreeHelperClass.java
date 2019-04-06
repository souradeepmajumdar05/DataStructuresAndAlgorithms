package btnbst;

public class TreeHelperClass 
{
	public static TreeNode createBST() 
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right =  new TreeNode(8);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(10);
		
		return root;
	}
}
