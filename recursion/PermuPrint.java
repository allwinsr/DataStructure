/*
 *	4 (1,2) => {{1,1,1,1}{2,2}{1,2,1}{1,1,2}{2,1,1}} 
 * 
 */
package recursion;

import java.util.Stack;

/**
 * @author allwin.raj
 * 
 */
public class PermuPrint {

	private int no = 5;
	private int[] allPossibles = { 1, 2,3,4,5 };

	public PermuPrint() {
	}

	public int[] selectPossibles(int no) {
		int[] arr = new int[5];
		for (int i = 0, k = 0; i < allPossibles.length; i++) {
			if (allPossibles[i] <= no) {
				arr[k++] = allPossibles[i];
			}
		}
		return arr;
	}

	public void permuPrint(int sum, String output) {
		int[] arr = selectPossibles(sum);
		if (sum == 0)
			System.out.println("{" + output + "}");

		for (int i = 0; i < arr.length && arr[i] != 0; i++) {
			int ele = arr[i];
			permuPrint(sum - ele, output + "" + ele);
		}

	}

	public static void main(String[] args) {
		PermuPrint permutation = new PermuPrint();
		System.out.println("Permutation of "+permutation.no);
		permutation.permuPrint(permutation.no, "");
	}

}
