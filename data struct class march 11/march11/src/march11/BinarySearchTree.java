package march11;

public class BinarySearchTree {
	private TreeNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public boolean isFull() {
		TreeNode tn = new TreeNode();
		return tn==null;
	}
	
	public void insert(int data) {
		if(isFull()) {
			System.out.println("tree is full");
		}
		else {
			if (isEmpty()) {
				TreeNode temp = new TreeNode();
				temp.setData(data);
				root = temp;
			}
			else {
				insertRecursive(root, data);
			}
		}
	}
	
	protected void insertRecursive(TreeNode parent, int data) {
		if(data<=parent.getData()) {
			if(parent.getLeft()==null) {
				TreeNode temp = new TreeNode();
				temp.setData(data);
				parent.setLeft(temp);
			}
			else {
				insertRecursive(parent.getLeft(), data);
			}
		}
		else {
			if(parent.getRight()==null) {
				TreeNode temp = new TreeNode();
				temp.setData(data);
				parent.setRight(temp);
			}
			else {
				insertRecursive(parent.getRight(), data);
			}
		}
	}
	
	public void display() {
		displayInOrder(root);
	};

	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}
	
	public void displayInOrder(TreeNode parent) {
		if(parent!=null) {
			displayInOrder(parent.getLeft());
			System.out.println(parent.getData());
			displayInOrder(parent.getRight());
		}
	}
	
	
	
	

}
