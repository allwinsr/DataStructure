package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class SingleLinkedListOperations {

	private static LinkedListNode head = null;
	private static LinkedListNode tail = null;
	
	public static void addElement(int d){
		LinkedListNode temp = new LinkedListNode(d, null);
		
		if(head == null){
			head = tail = temp;
		} else {
			tail.setNext(temp);
			tail = temp;
		}
	}
	
	public static void printList(){
		LinkedListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData()+"-->");
			temp = temp.getNext();
		}
		System.out.print("NULL\n");
	}
	
	public static boolean commonElement(LinkedListNode list1, LinkedListNode list2){
		boolean common = false;
		if(list1 == null && list2 == null){
			return true;
		}
		if((list1 == null && list2 != null ) || (list1 != null && list2 == null )){
			return common;
		}
		Map<Integer, Boolean> elems = new HashMap<Integer, Boolean>();
		
		LinkedListNode temp = list1;
		while(temp != null){
			elems.put(temp.getData(), true);
			temp = temp.getNext();
		}
		
		temp = list2;
		while(temp != null){
			if(elems.containsKey(temp.getData())){
				System.out.println("Common Elem Found : "+temp.getData());
				common = true;
			}
			temp = temp.getNext();
		}
		
		
		return common;
	}
	
	public static void main(String[] args) {
		//LinkedListNode list = new LinkedListNode();
		
		int i = 0;
		while(i++ <5 ){
			int num = (int) (100 * Math.random());
			addElement(num);
		}
		printList();
		
		LinkedListNode l1 = new LinkedListNode(1,null);
		LinkedListNode l2 = new LinkedListNode(1,null);
		LinkedListNode l3 = new LinkedListNode(1,null);
		LinkedListNode l4 = new LinkedListNode(1,null);
		LinkedListNode l5 = new LinkedListNode(1,null);
		l1.setNext(l2);
		l2.setNext(l3);
		// you continue
		
		
		
		LinkedListNode l6 = new LinkedListNode(1,null);
		LinkedListNode l7 = new LinkedListNode(2,null);
		LinkedListNode l8 = new LinkedListNode(3,null);
		
		l6.setNext(l7);
		l7.setNext(l8);
		
		System.out.println(" Result : " +commonElement(l1, l2));
		
		
		
	}
}
