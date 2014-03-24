/**
 * 
 */
package tree;

/**
 * @author allwin.raj
 *
 */
public class TreeNode {

	/**
	 * 
	 */
	TreeNode left;
	TreeNode right;
	TreeNode parent;
	int data;
	
	public TreeNode(int val) {
		// TODO Auto-generated constructor stub
		data = val;
		left = right = parent = null;
	}
	
	public TreeNode() {
		// TODO Auto-generated constructor stub
		//TreeNode(0);
	}
}
