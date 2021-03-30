
public class Binary_Search_1 {

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
	public static int binarySearch(int[] list, int key)
	{
		int low = 0;
		int high = list.length -1;

		while (high >= low)
		{
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid -1;
			else
				if (key == list[mid])
					return mid;
				else low = mid + 1;
		}
		return -low -1;
	}

}
