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
    public ArrayList<Integer> postorderTraversal(TreeNode A) 
    {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        postorderTraversalUtility( A , answer);
        return answer;
    }
    public void postorderTraversalUtility(TreeNode A ,ArrayList<Integer> answer) 
    {
        if(A==null)
        {
            return;
        }
        postorderTraversalUtility( A.left  , answer);
        postorderTraversalUtility( A.right , answer);
        answer.add(A.val);
    }
}