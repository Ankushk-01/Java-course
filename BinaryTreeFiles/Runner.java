package BinaryTreeFiles;

public class Runner {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(1);
		binaryTree.insert(2);
		binaryTree.insert(3);
		System.out.println("Done");
		
		binaryTree.show();
	}
}
