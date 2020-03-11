package march11;

public class driver {

	public static void main(String[] args) {
		int numbers[] = new int[] {6,3,18,27,2};
		BinarySearchTree tree = new BinarySearchTree();
		for(int i = 0; i<5;i++) {
			tree.insert(numbers[i]);
		}
		tree.display();
	}

}
