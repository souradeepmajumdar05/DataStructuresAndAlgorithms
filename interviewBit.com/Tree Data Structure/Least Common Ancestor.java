/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution 
{
    public int lca(TreeNode root, int B, int C)
    {
        if(!doesExist(root, B) || !doesExist(root, C)) {
            return -1;
        }
        TreeNode answer = lcaUtility(root,B,C);
        if(answer==null)
        {
            return -1;
        }
        else
        {
            return answer.val;
        }
        
    }
    public TreeNode lcaUtility(TreeNode root, int B, int C) 
    {
        if(root == null)
        {
            return null;
        }
        if(B==root.val||C==root.val)
        {
            return root;
        }
        TreeNode left = new TreeNode(-1);
        TreeNode right = new TreeNode(-1);
        //if(root.left!=null)
        //{
            left=lcaUtility( root.left, B, C);
            
        //}
        //if(root.right!=null)
        //{ 
            right=lcaUtility( root.right, B, C);
        //}
        if(left!=null&&right!=null)
        {
            return root;
        }
        
        return left!=null?left:right;
    }
     public boolean doesExist(TreeNode root, int num) {
        if (root == null) return false;
        if (root.val == num) return true;
        
        return doesExist(root.left, num) || doesExist(root.right, num); 
    }
}
