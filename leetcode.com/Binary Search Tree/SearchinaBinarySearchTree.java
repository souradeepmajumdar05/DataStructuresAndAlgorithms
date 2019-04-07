package bst;

public class SearchinaBinarySearchTree 
{
	public TreeNode searchBST(TreeNode root, int val) 
    {
        return searchBSTUtil(root, val) ;      
    }
    public TreeNode searchBSTUtil(TreeNode root, int val) 
    {
        if(root==null)
        {
            return null;
        }
        if(root.val==val)
        {
            return root;
        } 
        if(root.val> val)
        {
            return searchBSTUtil( root.left,  val);
        }
        else
        {
            return searchBSTUtil( root.right,  val);    
        }
    }
}
