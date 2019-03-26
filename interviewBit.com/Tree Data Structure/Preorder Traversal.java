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
    public ArrayList<Integer> preorderTraversal(TreeNode A) 
    {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        preorderTraversalUtility( A , answer);
        return answer;
    }
    public void preorderTraversalUtility(TreeNode A ,ArrayList<Integer> answer) 
    {
        if(A==null)
        {
            return;
        }
        answer.add(A.val);
        preorderTraversalUtility( A.left  , answer);
        preorderTraversalUtility( A.right , answer);
    }
}
