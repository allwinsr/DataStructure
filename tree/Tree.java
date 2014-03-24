/**
 * 
 */
package tree;

/**
 * @author allwin.raj
 *
 */
public class Tree {

	/**
	 * 
	 */
	TreeNode root;
	public Tree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	/**
	 * @param args
	 */
	public TreeNode getRoot(){
		return this.root;
	}
	public void insert(int val){
		TreeNode node = new TreeNode(val);
		
		if(root == null){
			root = node;
		}
		else {
			TreeNode storePlace = getPlace(val);
			node.parent = storePlace;
			if(storePlace.data < val)
				storePlace.right = node;
			else
				storePlace.left = node;
		}		
	}
	/*
	public boolean search(int val){
		TreeNode temp;
		for(temp=root; temp!=null; ){
			if(temp.data == val)
				return true;
			if(temp.data < val)
				temp = temp.right;
			else
				temp = temp.left;
		}
		return false;
	}
	*/
	public TreeNode search(int val){
		TreeNode temp = null;
		for(temp=root; temp!=null; ){
			if(temp.data == val)
				return temp;
			if(temp.data < val)
				temp = temp.right;
			else
				temp = temp.left;
		}
		return temp;
	}
	
	public boolean isFound(int val){
		TreeNode temp = null;
		for(temp=root; temp!=null; ){
			if(temp.data == val)
				return true;
			if(temp.data < val)
				temp = temp.right;
			else
				temp = temp.left;
		}
		return false;
	}
	
	public TreeNode getPlace(int val){
		TreeNode temp,prev;
		for(temp=prev=root; temp!=null; ){
			prev = temp;
			if(temp.data < val)
				temp = temp.right;
			else
				temp = temp.left;
			
		}
		return prev;
	}
	
	public void inorder(TreeNode root){
		if(root != null){
			inorder(root.left);
			//System.out.println(" | "+root.parent+" | "+(root.left == null ? "null" : root.left)+" | "+root.data+" | "+root+" | "+(root.right == null ? "null" : root.right)+" |  -->");
			System.out.print(root.data+" -> ");
			inorder(root.right);
		}
	}
	
	public void preorder(TreeNode root){
		if(root != null){
			System.out.print(root.data+" -> ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void postorder(TreeNode root){
		if(root != null){
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" -> ");
		}
	}
	 

	
	public TreeNode min(TreeNode root){
		while(root.left != null){
			root = root.left;
		}
		return root;
	}
	
	public TreeNode max(TreeNode root){
		while(root.right != null){
			root = root.right;
		}
		return root;
	}
	
	public TreeNode successor(int val){
		return successor(search(val));		
	}
	
	public TreeNode predecessor(int val){
		return predecessor(search(val));		
	}
	
	public TreeNode successor(TreeNode root){
		if(root.right != null)
			return min(root.right);
		TreeNode temp = root.parent;
		while(temp != null && root == temp.right){
			root = temp;
			temp = temp.parent;			
		}
		return temp;
	}
	
	public TreeNode predecessor(TreeNode root){
		if(root.left != null)
			return max(root.left);
		TreeNode temp = root.parent;
		while(temp != null && root == temp.left){
			root = temp;
			temp = temp.parent;			
		}
		return temp;
	}	
	
	public void delete(int val){
		if(isFound(val))
			delete(search(val));
		else
			System.out.println("No Such value exists.");
	}
	public void delete(TreeNode z){
		if(z.left == null)
			transplant(z,z.right);
		else if(z.right == null)
			transplant(z, z.left);
		else{
			TreeNode y;
			y = min(z.right);
			if(y.parent!=z){
				transplant(y, y.right);
				y.right = z.right;
				y.right.parent = y;
			}
			transplant(z, y);
			y.left = z.left;
			y.left.parent = y;			
		}
	}

	public void transplant(TreeNode u, TreeNode v){
		if(u.parent == null)
			this.root = v;
		else if(u == u.parent.left)
			u.parent.left = v;
		else
			u.parent.right = v;
		
		if(v!=null)
			v.parent = u.parent;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i = 0;
		System.out.println("Started");
		Tree test = new Tree();
		int  delete_val=0;
		while(i < 5){
			int val = (int) (100 * Math.random());
			test.insert(val);
			System.out.println("\n\n"+val + " is inserted.");
			i++;
			//System.out.println(val+" is found? "+test.search(val)+"\n");
		
			test.inorder(test.getRoot());
			System.out.println(" null");
			System.out.println("Tree Minimum : "+test.min(test.getRoot()).data);
			TreeNode successor = test.successor(val);
			TreeNode predecessor = test.predecessor(val);
			System.out.println("Successor of "+val+" is : "+(successor==null?"null":successor.data));
			System.out.println("predecessor of "+val+" is : "+(predecessor==null?"null":predecessor.data));
			System.out.println("Tree Maximum : "+test.max(test.getRoot()).data);
			delete_val = val;
			//System.out.println(" null");
		/*	test.preorder(test.getRoot());
			System.out.println(" null");
			test.postorder(test.getRoot());
			System.out.println(" null");
			*/
		}
		
		test.delete(delete_val);
		System.out.println(delete_val+" is Successfully deleted ");
		test.inorder(test.getRoot());
		System.out.println("Done");
	}

}
