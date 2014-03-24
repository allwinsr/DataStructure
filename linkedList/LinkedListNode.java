/**
 * 
 */
package linkedList;

/**
 * @author allwin.raj
 *
 */
public class LinkedListNode {

	LinkedListNode prev;
	int data;
	LinkedListNode next;
	
	
	public LinkedListNode(int data) {
		this.prev = this.next = null;
		this.data = data;
	}
	
	public LinkedListNode(LinkedListNode prev, int data) {
		this.prev = prev;
		this.next = null;
		this.data = data;
	}
	
	public LinkedListNode( int data, LinkedListNode next) {
		this.prev = null;
		this.next = next;
		this.data = data;
	}
	
	public LinkedListNode(LinkedListNode prev, int data, LinkedListNode next) {
		this.prev = prev;
		this.next = next;
		this.data = data;
	}
}
