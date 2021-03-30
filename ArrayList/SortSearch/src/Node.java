
public class Node 
{
	private int key;
	private String name;
	
	private Node leftChild;
	private Node rightChild;
	
	Node (int key, String name)
	{
		this.key = key;
		this.name = name;
	}
	
	public int getKey()
	{
		return key;
	}
	
	public Node getLeftChild()
	{
		return leftChild;
	}
	
	public Node getRightChild()
	{
		return rightChild;
	}

	public void setLeftChild(Node leftChild)
	{
		this.leftChild = leftChild;
	}
	
	public void setRightChild(Node rightChild)
	{
		this.rightChild = rightChild;
	}
	
	public String toString()
	{
		return name + " has the key" + key;
	}
}
