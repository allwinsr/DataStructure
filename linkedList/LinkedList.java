package linkedList;

public class LinkedList {
	
	private LinkedListNode head;
	private LinkedListNode tail;
	
	public LinkedList(){
		head = tail = null;
	}
	
	public LinkedListNode getHead(){
		return head;
	}
	
	public LinkedListNode getTail(){
		return tail;
	}
	
	public void insertAtFirst(int data){
		LinkedListNode temp = new LinkedListNode(data);
		if(head==null){
			head = tail = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	public void insertAtLast(int data){
		LinkedListNode temp = new LinkedListNode(data);
		if(head==null){
			head = tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
	}
	
	public void print(){
		LinkedListNode temp = head;
		while(temp != null){
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	public void reverseListWithoutRecursion(){
		LinkedListNode prev = null, nxt, curr = head;
		
		while(curr != null){
			nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;			
		}
		head = prev;
	}
	
	public void reverseListWithRecursion(LinkedListNode curr){
		
		if(curr == null)
			return;
		else{
			
			LinkedListNode nxt = curr.next;			
			if(nxt == null)
				return;
			
			curr.next = null;
			head = nxt;
			reverseListWithRecursion(nxt);
			nxt.next = curr;
		}
		
		
	}
			
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		int i = 0;
		while(i++ <5 ){
			int num = (int) (100 * Math.random());
			list.insertAtLast(num);
			list.insertAtFirst((int) (100 * Math.random()));
			list.print();
			
		}
		list.print();
		System.out.println("After the reverse the list without Recursion:");
		list.reverseListWithoutRecursion();
		list.print();
		System.out.println("After the reverse the list with Recursion:");
		list.reverseListWithRecursion(list.getHead());
		list.print();
		
	}
}
