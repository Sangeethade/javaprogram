import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<String> s = new TreeSet<String>();
		s.add("pen");
		s.add("pencil");
		s.add("mouse");
		s.add("phone");
		//s.add(null);
		s.add("ac");
		s.add("bottle");
		s.add("earphone");
		s.add("pen"); // duplicate not allowed
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<Integer> s1 = new TreeSet<Integer>();
		s1.add(39);
		s1.add(90);
		s1.add(30);
		s1.add(88);
		s1.add(15);
		s1.add(99);
		
		//Iterator <Integer> itr1 = ((TreeSet<Integer>)s1).descendingIterator();
		Iterator<Integer> itr1 = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
		System.out.println("lowest : "+((TreeSet<Integer>)s1).pollFirst());
		System.out.println("Highest : "+((TreeSet<Integer>)s1).pollLast());
		}

	}


