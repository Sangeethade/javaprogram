import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayListExample {
	public static void main(String[]args) {
		List<String> al = new ArrayList<String>();
		
		al.add("Rose");
		al.add("sun flower");
		al.add("rose");
		al.add("lily");
		al.add("marigold");
		al.add("tulip");
		al.add("jasmine");
		al.add("orchid");
		al.add("lotus");
		al.add("lavender");
		
		System.out.println("Before reversing");
		System.out.println(al.toString());
		
		Collections.reverse(al);
		System.out.println("after reversing");
		System.out.println(al);
		
		//sorting 
	}

}
