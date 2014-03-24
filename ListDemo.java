import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author allwin.raj
 *
 */
public class ListDemo {

	/**
	 * 
	 */
	private static List<String> STATES;
	public ListDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STATES = Arrays.asList( "---Select---", "AL", "AZ", "CO", "DE", "FL", "GA", "IA", "IL", "IN", "KS", "KY", "LA", "MI", "MN", "MO", "MS", "NC", "NE", "NJ", "NV", "NY", "OH", "PA", "SC", "TN", "TX", "VA", "WI", "WV", "WY");
		
		for (String state : STATES) {
			//choices.add(new DropDownOptionsVO("Morning","Morninig"));
			System.out.println("choices.add(new DropDownOptionsVO(\""+state+"\", \""+state+"\"));");
			
		}
	}

}
