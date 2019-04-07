package bt;

public class PopulatingNextRightPointersinEachNode 
{
	public Node connect(Node root) 
	{
        if(root == null)
            return root;

        if(root.left != null)
        {
            root.left.next = root.right;
            if(root.next != null)
                root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);
        return root;
    }
}
