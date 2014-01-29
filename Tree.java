import java.io.*;
import java.util.*;
import java.lang.*;

 class Node {
	private int data;
	private Node left;
	private Node right;
	
	Node(int val){
		this.data = val;
		this.left  = null;
		this.right = null;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void display(){
		System.out.println("Data : "+this.data+", Left : "+left+", Right : "+right);
	}
	
	public void disp(Node t){
		if(t!=null){
			t.disp(t.getLeft());
			System.out.println(t.getData());
			t.disp(t.getRight());			
		}
		
	}
	
}
public class Tree extends Node {
	Tree(int val) {
		super(val);
		// TODO Auto-generated constructor stub
	}

	public Node root;
	

	
	
	public void insert(int val){
		Node node = new Node(val);
		if(root== null){
			root = node;
		}
		else if(root.getLeft() == null) {
			root.setLeft(node);
		} else{
			root.setRight(node);
		}
	}
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Started");
		int val = 7;
		
		Tree t = new Tree(0);
		t.insert(val);
		t.insert(5);
		t.insert(9);
		t.insert(91);
		t.insert(92);
		t.disp(t.root);
		System.out.println("Stopped");

	}

}
