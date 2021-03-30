
public class BinaryTree 
{
	private Node root;

	public BinaryTree()
	{		
	}

	public Node getRoot()
	{
		return root;
	}

	public void addNode(int key, String name)
	{
		Node newNode = new Node(key, name);
		if (root == null)
		{
			root = newNode;
		}
		else
		{
			Node focusNode = root;
			Node parent;
			while (true)
			{
				parent = focusNode;
				if (key < focusNode.getKey())
				{
					focusNode = focusNode.getLeftChild();
					if(focusNode == null)
					{
						parent.setLeftChild(newNode);
						return;
					}
				}
				else
				{
					focusNode = focusNode.getRightChild();

					if (focusNode == null)
					{
						parent.setRightChild(newNode);
						return;
					}
				}
			}
		}
	}
	public void inOrderTraverseTree(Node focusNode)
	{
		if (focusNode != null)
		{
			inOrderTraverseTree(focusNode.getLeftChild());
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.getRightChild());
		}
	}

	public void preorderTraverseTree(Node focusNode)
	{
		if(focusNode != null)
		{
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.getLeftChild());
			preorderTraverseTree(focusNode.getRightChild());
		}
	}

	public void postOrderTraverseTree(Node focusNode)
	{
		if (focusNode != null)
		{
			postOrderTraverseTree(focusNode.getLeftChild());
			postOrderTraverseTree(focusNode.getRightChild());
			System.out.println(focusNode);
		}
	}

	public Node findNode(int key)
	{
		Node focusNode = root;
		while (focusNode.getKey() != key)
		{
			if (key < focusNode.getKey())
			{
				focusNode = focusNode.getLeftChild();
			}
			else
			{
				focusNode = focusNode.getRightChild();
			}
			if (focusNode == null)
				return null;
		}

		return focusNode;
	}
}
