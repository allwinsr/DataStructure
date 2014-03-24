/**
 * 
 */

/**
 * @author allwin.raj
 *
 */
public class TestGeneric<T>{

	/**
	 * 
	 */
	T data;
	public TestGeneric() {
		// TODO Auto-generated constructor stub
	}
	public void setData(T val){
		this.data = val;
	}
	public T getData(){
		return this.data;
	}
	
	public <T extends Comparable<T>> String max(T a, T b) {
//	    if (a == null) {
//	        if (b == null) return a;
//	        else return b;
//	    }
//	    if (b == null)
//	        return a;
	    return a.compareTo(b) == 0 ? "Same" : "Not same";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric<Integer> tg = new TestGeneric<Integer>();
		TestGeneric<Integer> tg1 = new TestGeneric<Integer>();
		TestGeneric<Integer> tg2 = new TestGeneric<Integer>();

		TestGeneric<String> tgs = new TestGeneric<String>();
		TestGeneric<String> tgs1 = new TestGeneric<String>();
		TestGeneric<String> tgs2 = new TestGeneric<String>();

		
		tgs.setData("allwin");
		System.out.println(tg.getData());
		tgs1.setData("allwin");
	
		System.out.println("max: "+tgs2.max(tgs.getData(),tgs1.getData()));
	
//		tg.setData("Allwin Generics Works");
//		System.out.println(tg.getData());
//		tg.setData('a');
//		System.out.println(tg.getData());
//		tg.setData(12369.366);
//		System.out.println(tg.getData());
//		tg.setData(123);
		

	}

}
