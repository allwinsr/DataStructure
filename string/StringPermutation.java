package string;
/**
 * @author allwin.raj
 *
 */
public class StringPermutation {

	/**
	 * 
	 */
	public StringPermutation(String str) {
		permutate("",str);
	}

	private static void permutate(String output, String str) {
		
		if(str.length()==0){
			System.out.println(""+output);
		}
		
		for(int i=0;i<str.length();i++){
			permutate(output+str.charAt(i)+"", str.substring(0,i)+str.substring(i+1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		permutate("",str);
	}
}
