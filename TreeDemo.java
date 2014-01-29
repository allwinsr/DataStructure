/**
	Binary Search Tree - Progress
 * 
 */

/**
 * @author allwin.raj
 *
 */
public class TreeDemo<T> extends TreeNode {

	/**
	 * 
	 */
	TreeNode root;
	
	public TreeDemo() {
		// TODO Auto-generated constructor stub
		super();
		root = null;
	}
	
	public void insert(T val){
		TreeNode node = new TreeNode(val);
		if(root == null){
			root = node;
		}
		else {
			
		}
	}
	
	public <T extends Comparable<T>> int max(T a, T b) {
//	    if (a == null) {
//	        if (b == null) return a;
//	        else return b;
//	    }
//	    if (b == null)
//	        return a;
	    return a.compareTo(b) == 0 ? 0:1;
	}
	public TreeNode search(T val){
		TreeNode temp = root;
		while(temp != null){
			T nodeVal = (T) temp.data;
			//if(max(nodeVal, val) == -1 ){
			//}
			if(nodeVal.equals(val)){
				return temp;
			}
			else {
				
			}
		}
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeDemo td = new TreeDemo();
		td.insert(123);
		td.insert("Asdsdfa");
		System.out.println("Perfect");
		
		
	}

}
