import java.util.ArrayList;

/**
 * 
 */

/**
 * @author allwin.raj
 *
 */
public class ArrayListDemo {

	/**
	 * 
	 * 
	 */
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	public static ArrayList<String> strAl = new ArrayList<String>();
	
	public ArrayListDemo() {
		// TODO Auto-generated constructor stub
		al.add(1);
	}
	
	public void addInt(int val){
		al.add(val);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo ald = new ArrayListDemo();
		ald.addInt(147);
		System.out.println(al);
		strAl.add("\"super\",\"duper\"");
		strAl.add("\"super\",\"duper1\"");
		System.out.println(strAl);
		for (String str : strAl) {
			System.out.println(str.split(",")[1]+", "+str.split(",")[0]);
			
		}
	}

}
