package BinaryTreeFiles;

public class BinaryTree {
	private Node root;
	public void insert(int data) {
		root = insertRec(root,data);
	}
	
	private Node insertRec(Node root2, int data) {
		if(root2 == null) {
			root2 = new Node(data);
		}else if(data < root2.data) {
			root2.left = insertRec(root2.left, data);
		}else if(data > root2.data){
			root2.right = insertRec(root2.right, data);
		}
		return root2;
	}

	public void inorder() {
		inorderRec(root);
	}

	private void inorderRec(Node root2) {
		if(root2!=null) {
			inorderRec(root2.left);
			System.out.print(root2.data+" ");
			inorderRec(root2.right);
		}
	}
}
