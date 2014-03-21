/*
 *Dynamic Programming can be used to find the longest common substring in O(m*n) time. 
 *The idea is to find length of the longest common suffix for all substrings of both strings and store these lengths in a table.
 *
 *But space Complexity is O(m+1*m+1) = O(m*m)
 * 
 */
package string;

/**
 * @author allwin.raj
 *
 */
public class LongestCommonPatternInString {

	static String str = "OldSite:GeeksforGeeks.org";
	static String pattern = "NewSite:GeeksQuiz.com";
	static int[][] count = new int[str.length()+1][str.length()+1];
	static int maxCount = 0;
	static String maxPattern = "";
	
	public LongestCommonPatternInString() {
	}

	public static void main(String[] args) {

		findCommonPattern(str, pattern);
	}

	public static void init(){
		//Initializing
		for(int i = 0; i< str.length()+1; i++)
			for(int j=0; j<str.length()+1; j++ )
				count[i][j] = 0;
	}
	
	public static void printTable(){
		//Initializing
		for(int i = 0; i< str.length()+1; i++, System.out.println(""))
			for(int j=0; j<str.length()+1; j++ )
				System.out.print(count[i][j]+" ");
	}
	private static void findCommonPattern(String str, String pattern) {
		init();
		for(int i =0; i< str.length(); i++){
			//System.out.print(" "+str.charAt(i));
			for(int j=0;j<pattern.length();j++){
				if(pattern.charAt(j) == str.charAt(i)){
					count[i+1][j+1] = count[i][j]+1;
					
					if(count[i+1][j+1] > maxCount){
						maxCount = count[i+1][j+1];
						maxPattern += ""+str.charAt(i);
					}
				}
			}
		}
		printTable();
		System.out.println("Maximum count of the pattern is ->"+maxCount+"<-.");
		System.out.println("Maximum count of the pattern is ->"+maxPattern+"<-.");

	}

}
