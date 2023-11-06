
public class MainBinaryTree {

	public static void main(String [] args) {
		BinaryTree<Integer> tree = new BinaryTree<>();
		
		tree.insert(5);
		tree.insert(17);
		tree.insert(3);
		tree.insert(8);
		tree.insert(19);
		tree.insert(2);
		tree.insert(20);
		tree.insert(1);
		
		  System.out.print("Printed in Order : ");
	      tree.inOrderTraversal();		
		
		
	}
}
