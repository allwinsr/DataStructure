/**
 * Print all possible strings of length k that can be formed from a set of n characters
 * set[] = {'a', 'b'}, k = 3

	Output:
	aaa
	aab
	aba
	abb
	baa
	bab
	bba
	bbb

 */
package string;

/**
 * @author allwin.raj
 *
 */
public class PrintAllKLengthStrings {

	static int count = 0;
	public PrintAllKLengthStrings(String str,int k) {
		printAllKLengthRec(str.toCharArray(), k, str.length(),"");
	}

		//Exclusion of the same characters
		private static void printAllKLengthRec1(String str, int k, String output) {
			if(k==0){
				System.out.println(/*++count +".\t"+*/output);
			}
			
			for(int i = 0; i< str.length();i++){
				printAllKLengthRec1(str.substring(0, i)+str.substring(i+1),k-1,output+str.charAt(i));
			}
		}
		
		//Inclusion of the same characters
		private static void printAllKLengthRec(char set[], int k, int len, String prefix) {
	         
	        // Base case: k is 0, print prefix
	        if (k == 0) {
	        	System.out.println(++count +".\t"+prefix);
	            return;
	        }
	 
	        // One by one add all characters from set and recursively 
	        // call for k equals to k-1
	        for (int i = 0; i < len; ++i) {
	             
	            // Next character of input added
	            String newPrefix = prefix + set[i]; 
	             
	            // k is decreased, because we have added a new character
	            printAllKLengthRec(set, k-1, len,  newPrefix); 
	        }
	    }

		public static void main(String[] args) {
		String str="abcd";
		int k = 2;
		int len = str.length();
		System.out.println("\nExclusion of the same characters");
		printAllKLengthRec1(str,k,"");
		count =0;
		System.out.println("\n\nInclusion of the same characters");
		printAllKLengthRec(str.toCharArray(),k,len,"");
	}


	
}
