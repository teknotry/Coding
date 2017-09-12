
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Node{

	int data;
	Node next;

	public Node(int data){
		this.data=data;
		this.next=null;
	}

}


public class MergeTwoSortedLinkedList{


	//Merging two sorted linked list using recursion
	public Node mergeTwoLinkedList(Node root1,Node root2){

		if(root1 == null){
			return root2;
		}
		if(root2 == null){
			return root1;
		}

		if(root1.data < root2.data){
			Node temp=root1.next;
			root1.next=root2;
			root1.next = mergeTwoLinkedList(temp,root2);
			return root1;
		}else{
			Node temp=root2.next;
			root2.next=root1;
			root2.next = mergeTwoLinkedList(root1,temp);
			return root2;
		}
	}


	//Create sorted linked list
	public Node createSortedLinkedList(){

		Node root=null;
		Node temp=null;
		ArrayList<Integer> list=new ArrayList<Integer>();
		Random rand=new Random();
		for(int i=0;i<10;i++){
			list.add(rand.nextInt(50));
		}
		Collections.sort(list);
		for(int element:list){
			if(root == null){
				root=temp=new Node(element);
			}else{
				temp.next=new Node(element);
				temp=temp.next;
			}
		}
		return root;

	}

	//Printing the sorted linked list.
	public void printSortedLinkedList(Node root){

		if(root == null)
			return;
		while(root.next !=null){
			System.out.print(root.data+ " ");
			root=root.next;
		}
		System.out.println("");


	}



	//Main method to test.
	public static void main(String args[]){

		MergeTwoSortedLinkedList mergeTwoSortedLinkedList=new MergeTwoSortedLinkedList();
		Node root1=mergeTwoSortedLinkedList.createSortedLinkedList();
		Node root2=mergeTwoSortedLinkedList.createSortedLinkedList();

		mergeTwoSortedLinkedList.printSortedLinkedList(root1);
		mergeTwoSortedLinkedList.printSortedLinkedList(root2);

		Node output = mergeTwoSortedLinkedList.mergeTwoLinkedList(root1,root2);
		mergeTwoSortedLinkedList.printSortedLinkedList(output);


	}

}