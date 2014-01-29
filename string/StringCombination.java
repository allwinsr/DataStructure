/**
 * Print all possible combinations of r elements in a given array of size n
 */
package string;

/**
 * @author allwin.raj
 *
 */
public class StringCombination {

	public StringCombination(String str, int k) {
		combination(str, k, 0, "");
	}
	
	private static void combination(String str, int k,int i, String output) {
		if(k==0)
			System.out.println(output);
		
		for(;i<str.length();i++)
			combination(str.substring(0, i)+str.substring(i+1), k-1, i, output+str.charAt(i));
	}
	
	private static void allCombination(String str, int k,int i, String output) {
		if(output!="")
			System.out.println(output);
		
		for(;i<str.length();i++)
			combination(str.substring(0, i)+str.substring(i+1), k-1, i, output+str.charAt(i));
	}
	public static void main(String[] args) {
		String str="12345";
		int k=3;
		//combination(str,k,0,"")	;
		allCombination(str,k,0,"")	;
	}
}