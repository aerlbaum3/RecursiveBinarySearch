
public class BinaryTree<T extends Comparable<T>> {

	private TreeNode<T> root; 
	
	public void insert(T value) {
		root = insertNode(root, value);
		
		
	}

	public TreeNode<T> insertNode(TreeNode<T> root, T value) {
		
		if(root == null) {
			root = new TreeNode<>(value);
			return root;
		}
		
		if(value.compareTo(root.getData())< 0) {
			root.setLeft(insertNode(root.getLeft(),value));
			
		}else if(value.compareTo(root.getData())> 0) {
			root.setRight(insertNode(root.getRight(), value));
		}
		return root;
		
	}
	
	public void inOrderTraversal() {
        inOrderNode(root);
    }

    public void inOrderNode(TreeNode node) {
    // Base case: If the node is null (a leaf), return immediately.
    if (node == null) {
        return;
    }

    // Recursive case: Process the left subtree.
    inOrderNode(node.getLeft());

    // Process the current node.
    System.out.print(node.getData() + " ");

    // Recursive case: Process the right subtree.
    inOrderNode(node.getRight());
}


	
	
}
