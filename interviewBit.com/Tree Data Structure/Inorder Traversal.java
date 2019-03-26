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
    public ArrayList<Integer> inorderTraversal(TreeNode A) 
    {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        inorderTraversalUtility( A , answer);
        return answer;
    }
    public void inorderTraversalUtility(TreeNode A ,ArrayList<Integer> answer) 
    {
        if(A==null)
        {
            return;
        }
        inorderTraversalUtility( A.left , answer);
        answer.add(A.val);
        inorderTraversalUtility( A.right , answer);
    }
}
