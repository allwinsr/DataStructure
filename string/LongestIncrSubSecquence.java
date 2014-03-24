/*
 *	Longest Incresing Sub Secquence 
 *In computer science, the longest increasing subsequence problem is to find a subsequence of a given sequence in which the subsequence's elements are in sorted order, 
 *lowest to highest, and in which the subsequence is as long as possible. This subsequence is not necessarily contiguous, or unique. 
 *Longest increasing subsequences are studied in the context of various disciplines related to mathematics, including algorithmics, 
 *random matrix theory, representation theory, and physics.
 *[1] The longest increasing subsequence problem is solvable in time O(n log n), 
 *where n denotes the length of the input sequence.[2]

In the binary Van der Corput sequence
0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15, …
a longest increasing subsequence is
0, 2, 6, 9, 13, 15.
This subsequence has length six; the input sequence has no seven-member increasing subsequences. The longest increasing subsequence in this example is not unique: for instance,
0, 4, 6, 9, 11, 15 or 0, 4, 6, 9, 13, 15
are other increasing subsequences of equal length in the same input sequence.
 * 
 */
package string;

/**
 * @author allwin.raj
 * 
 */
public class LongestIncrSubSecquence {

	/**
	 * 
	 */
	public LongestIncrSubSecquence() {
	}

	/**
	 * @param args
	 */
	public static void lis(int nos[], int index, int sum, int[] output, int outIndex){
		
		for(int i = index; i< nos.length;i++){
			if(nos[i+1] > nos[i]){
				output[outIndex] = nos[i];
				for(int k= 0 ; k < outIndex ; i++){
					System.out.print(""+output[k]+" -> " );
				}
				System.out.println("");
				lis(nos, i+1, nos[i]+nos[i+1], output, outIndex+1);
				
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("God is Great :)");
		int nos[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int output[] = new int[100] ;
				
		lis(nos, 0, 0, output, 0);
		
	}

}
