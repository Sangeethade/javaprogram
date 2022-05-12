import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListUsingIteratorExample {

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
		
		
		System.out.println("traversing using for loop");
		for(int i =0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("traversing using for each loop");
		for(String i :al) {
			System.out.println(i);
		}
		System.out.println("traversing using iterator");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("traversing using List iterator");
		ListIterator<String> itr1 = al.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("traversing using iterator -forward");
		ListIterator<String> itr2 = al.listIterator(al.size());
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
		
		
		System.out.println("traversing using iterator -backward");
		ListIterator<String> it = al.listIterator(al.size());
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}
