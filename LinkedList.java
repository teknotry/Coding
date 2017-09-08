
class ListNode{
	int data;
	ListNode next;
	ListNode(int data){
		this.data=data;
		this.next=null;
	}

}

public class LinkedList{

	/* Reverse the linked list iterative
	 * Time Complexity O(n)
	 * Space Complexity O(1) 
	 **/
	public static ListNode reverse(ListNode head){
		ListNode prev=null;
		ListNode curr=head;
		while(curr !=null){
			ListNode temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}

	/* Reverse the linked list iterative
	 * Time Complexity O(n)
	 * Space Complexity O(n) 
	 **/
	public static ListNode reverseRecurr(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode temp=reverseRecurr(head.next);
		head.next.next=head;
		head.next=null;
		return temp;
	}



	//Add node to linked list
	public static ListNode addNode(ListNode head,int data){
		if(head == null){
			head=new ListNode(data);
		}else{
			ListNode curr=head;
			while(curr.next !=null)
				curr=curr.next;
			curr.next=new ListNode(data);

		}
		return head;
	}

	//Print linked list Ex : { 1 -> 2 -> 3 -> 4 -> null }
	public static void printLinkedList(ListNode head){
		while(head !=null){
			System.out.print(head.data + " -> ");
			head=head.next;
		}
		System.out.println("null");
	}



	public static void main(String args[]){
		ListNode head=null;
		head=addNode(head,1);
		head=addNode(head,2);
		head=addNode(head,3);
		head=addNode(head,4);
		printLinkedList(head);
		head=reverse(head);		
		printLinkedList(head);
		head=reverseRecurr(head);
		printLinkedList(head);
	}


}
