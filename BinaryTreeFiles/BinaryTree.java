package BinaryTreeFiles;

public class BinaryTree {
	private Node root;
	public void insert(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
		}else {
			Node temp = root;
			while(temp.left!=null && temp.right!=null) {
				if(data<temp.data) {
					temp = temp.left;
				}else {
					temp = temp.right;
				}
			}
			if(data<temp.data) {
				temp.left = newNode;
			}else {
				temp.right = newNode;
			}
			
		}
	}
	
	public void show() {
		while(root!=null) {
			System.out.print(root.data+" ");
			root = root.right;
		}
	}
}
