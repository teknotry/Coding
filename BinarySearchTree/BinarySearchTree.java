
class Node{

	int data;
	Node left;
	Node right;

	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class BinarySearchTree{

	public static void main(String args[]){
		BinarySearchTree binarySearchTree=new BinarySearchTree();

		System.out.println("Inserting element into BST");
		Node root = binarySearchTree.insert(null,5);
		root = binarySearchTree.insert(root,2);
		root = binarySearchTree.insert(root,10);
		root = binarySearchTree.insert(root,7);
		root = binarySearchTree.insert(root,9);

		System.out.println("\nInOrder Traversal of BST");
		binarySearchTree.printInOrder(root);
		System.out.println("\nPreOrder Traversal of BST");
		binarySearchTree.printPreOrder(root);
		System.out.println("\nPostOrder Traversal of BST");
		binarySearchTree.printPostOrder(root);

		System.out.println("\nFinding element in BST");
		System.out.println(binarySearchTree.contains(root,7));


		root=binarySearchTree.delete(root,10);
		System.out.println("\nInOrder Traversal of BST after delete");
		binarySearchTree.printInOrder(root);


		root=binarySearchTree.delete(root,9);
		System.out.println("\nInOrder Traversal of BST after delete");
		binarySearchTree.printInOrder(root);
	}


	public void printInOrder(Node root){
		if(root == null)
			return;
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);

	}

	public void printPreOrder(Node root){
		if(root == null)
			return;

		System.out.println(root.data);
		printInOrder(root.left);
		printInOrder(root.right);

	}

	public void printPostOrder(Node root){
		if(root == null)
			return;
		printInOrder(root.left);
		printInOrder(root.right);
		System.out.println(root.data);

	}

	public Node insert(Node root,int data){

		if(root == null){
			root=new Node(data);
		}else{
			if(data > root.data){
				if(root.right == null)
					root.right=new Node(data);
				else
					insert(root.right,data);
			}else{
				if(root.left == null)
					root.left=new Node(data);
				else
					insert(root.left,data);
			}
		}

		return root;
	}

	public boolean contains(Node root,int data){

		if(root == null)
			return false;
		else{
			if(root.data == data)
				return true;
			else{
				if(data < root.data && root.left !=null){
					return contains(root.left,data);
				}else if(data > root.data && root.right !=null){
					return contains(root.right,data);
				}
			}	
		}
		return false;
	}

	public Node findSuccessor(Node node){
		if(node.left == null)
			return node;
		else
			return findSuccessor(node.left);
	}


	public Node delete(Node root,int data){

		if(root ==null){
			System.out.println("Tree is empty");
			return root;
		}else{
			if(root.data == data){
				System.out.println("Element found ");
				if(root.left == null && root.right == null){
					root=null;
					return root;
				}else if(root.left == null){
					root=root.right;
					return root;
				}else if(root.right == null){
					root=root.left;
					return root;
				}else{
					Node temp=findSuccessor(root.right);
					temp.right=root.right;
					temp.left=root.left;
					root=temp;
				}
			}else{
				if(data < root.data && root.left !=null){
					root.left=delete(root.left,data);
				}else if(data > root.data && root.right !=null){
					root.right=delete(root.right,data);
				}else{
					System.out.println("Element not found");
				}
			}

		}
		return root;
	}




	

}






