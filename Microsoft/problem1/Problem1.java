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


public class Problem1{

	public static void add(Node root, int data){
		if (root == null){
			root=new Node(data);
			return;
		}
		if(data<root.data){
			if(root.left ==null){
				root.left=new Node(data);
			}else{
				add(root.left,data);
			}
		}
		else{
			if(root.right ==null){
				root.right=new Node(data);
			}else{
				add(root.right,data);
			}
		}
	}

	public static void traversePreOrder(Node root){

		if(root ==null)
			return;
		System.out.println(root.data);
		traversePreOrder(root.left);
		traversePreOrder(root.right);
	}

	public static void main(String args[]){
		System.out.println("Problem1 : ");

		Node root=null;
		add(root,10);
		System.out.println(root);
		traversePreOrder(root);

	}
}