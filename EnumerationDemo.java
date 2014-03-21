import java.util.Enumeration;
import java.util.Vector;


public class EnumerationDemo {
	public static void main(String[] args) {
		Enumeration days;
		Vector<String> weekDays = new Vector();
		weekDays.add("S");
		weekDays.add("M");
		weekDays.add("T");
		weekDays.addElement("W");
		weekDays.addElement("T");
		weekDays.addElement("F");
		weekDays.add("S");
		
		System.out.println(weekDays.indexOf("W"));
		System.out.println(weekDays.elementAt(3));
		days = weekDays.elements();
		System.out.println(weekDays);
		
		while(days.hasMoreElements())
			System.out.println(days.nextElement());
	}
}
