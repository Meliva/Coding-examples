
public class Practice_Exercise_4_2 
{
	public static void main(String[] args)
	{
		BinaryTree theTree = new BinaryTree();
		theTree.addNode(52, "Mary");
		theTree.addNode(21, "Jenna");
		theTree.addNode(34, "Louise");
		theTree.addNode(67, "Peter");
		theTree.addNode(88, "Xavier");
		theTree.addNode(7, "Amy");
		theTree.addNode(15, "Con");
		theTree.addNode(58, "Oliver");
		theTree.addNode(48, "Mark");
		theTree.addNode(73, "Tran");
		
		System.out.println("\ninorder is:");
		theTree.inOrderTraverseTree(theTree.getRoot());
		System.out.println("\npreorder is:");
		theTree.preorderTraverseTree(theTree.getRoot());
		System.out.println("\npostorder is:");
		theTree.postOrderTraverseTree(theTree.getRoot());
		
		System.out.println("\nNode with the key 67");
		System.out.println(theTree.findNode(67));
	}
}
