package btnbst;

public class Tester 
{
	public static void main(String args[])
	{
		TreeNode bst = TreeHelperClass.createBST();
		System.out.println("Pre Order With Stack : ");
		PreOrderWithStack.preorderIteration(bst);
		System.out.println();
		System.out.println("In Order With Stack : ");
		InOrderWithStack.inorderIteration(bst);
		System.out.println();
		System.out.println("Post Order With Stack : ");
		PostOrderWithStack.postorderIterative(bst);
		System.out.println();
		System.out.println("Level Order With Queue : ");
		LevelOrderTraversalWithQueue.levelOrderTraversal(bst);
	}	
}
