package linkedlist;
// Single_LinkedList.java  -> LinkedList.java 
// while using remove the Single_ from name 
public class LinkedListNode {
	private int data ;
	private LinkedListNode next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	
	public LinkedListNode(int d , LinkedListNode node){
		this.data= d;
		this.next=node;
	}
}
