import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortExample {

	public static void main(String[] args) {
		
List<String>al = new ArrayList<String>();
		
		
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
		al.add(" ");
		System.out.println("String sorted list:");
		//sorting al
		Collections.sort(al);
		for(String a:al) {
			System.out.println(a);
		}
		
		List<Integer>al1 = new ArrayList<Integer>();
		al1.add(20);
		al1.add(60);
		al1.add(20);
		al1.add(10);
		al1.add(67);
		al1.add(98);
		al1.add(5);
		al1.add(94);
		
		
		System.out.println("Integer sorted list");
		//sorting al1 in ascending
		Collections.sort(al1);
		
		for(Integer i :al1) {
			System.out.println(i);
		}
		
		//sorting al1 in descending
		Collections.reverse(al1);
		System.out.println(al1);
		}
	}


